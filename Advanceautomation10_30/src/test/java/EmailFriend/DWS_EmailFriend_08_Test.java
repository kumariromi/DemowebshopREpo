package EmailFriend;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_EmailFriend_08_Test extends BaseClass {
	@Test
	public void CaptureErrorMsgbyEmailingFriend() {
		emailerrormsgpage.getApparelShoeslink().click();
		emailerrormsgpage.getPolkaDotTop().click();
		emailerrormsgpage.getEmailaFriendButton().click();
		emailerrormsgpage.getEnterFriendEmail().sendKeys("abc@yahoo.com");
		emailerrormsgpage.getEnteryourEmail().sendKeys("def@gmail.com");
		emailerrormsgpage.getSendEmailButton().click();
		String ActualErrorMsg=emailerrormsgpage.getErrorMsg().getText();
		String ExpectedErrorMsg="Only registered customers can use email a friend feature";
		assertTrue( ActualErrorMsg.equals(ExpectedErrorMsg));
		logger.log(Status.INFO, "Yes, Actual msg is same as Expected Msg");
		
	}

}
