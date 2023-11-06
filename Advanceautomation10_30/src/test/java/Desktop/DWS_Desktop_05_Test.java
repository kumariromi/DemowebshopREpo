package Desktop;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_Desktop_05_Test extends BaseClass{
	@Test

	public void addDeskTopToCart() throws InterruptedException{
		
		desktopage.getComputerClick().click();
		desktopage.getDesktopsClick().click();
		desktopage.getClickonProduct().click();
		desktopage.getAddtoCompareList().click();
		Thread.sleep(2000);
		desktopage.getComputerClick().click();
		desktopage.getDesktopsClick().click();
	
		desktopage.getClickonProduct1().click();
		desktopage.getAddtoCompareList().click();
		assertTrue(desktopage.getClickonProduct().isDisplayed());
		logger.log(Status.INFO,"Product added to CompareList");
}

}