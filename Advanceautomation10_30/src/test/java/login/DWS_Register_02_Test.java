package login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_Register_02_Test extends BaseClass {
	@Test
	public void userRegistration() {
		
		registerpage.getRegistrationLink().click();
		registerpage.getGender().click();
		registerpage.getFirstName().sendKeys("Qspiders");
		registerpage.getLastName().sendKeys("A");
		registerpage.getRegisterEmail().sendKeys("Qspiders@gmail.com");
		registerpage.getRegisterPassword().sendKeys("abcdef");
		registerpage.getRegisterConfirmPassword().sendKeys("abcdef");
		registerpage.getRegistrationButton().click();
	}

}

		
		
	
