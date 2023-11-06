package login;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ExcelUtility;
import genericUtilities.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_Login_01_Test extends BaseClass {
	@Test(dataProvider="data",dataProviderClass=ExcelUtility.class)
	public void Login_to_application_withValidCredentials(String email,String password) {
	
		loginpage.getLogin().click();
		logger.log(Status.INFO,"User click on login link");
		loginpage.getEmail().sendKeys(email);
		logger.log(Status.INFO,"User entered email address");
		loginpage.getPassword().sendKeys(password);
		logger.log(Status.INFO,"User entered password");
		//loginpage.getRememberMe().click();
		//logger.log(Status.INFO,"User click on RememberMe");
		
		loginpage.getLoginBtn().click();
		logger.log(Status.INFO,"User click on login Button");
		
//		// pageurl=loginpage.driver.getCurrentUrl();
//		boolean checkpage;
//		if(pageurl.equals(property.getDataFromPropertyFile("url"))) {
//			checkpage=true;
//			logger.log(Status.INFO,"User navigate to Home page");
		//}else {
//		//=false;
//			logger.log(Status.FAIL,"User  login failed");
//		}
//		assertTrue(checkpage);
	}

}
