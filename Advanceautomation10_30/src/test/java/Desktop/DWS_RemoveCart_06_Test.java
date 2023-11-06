package Desktop;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_RemoveCart_06_Test extends BaseClass {
	@Test

	public void removeproductfromcart() throws InterruptedException{
		desktopage.getComputerClick().click();
		desktopage.getDesktopsClick().click();
		desktopage.getClickonProduct().click();
		desktopage.getAddtoCompareList().click();
		
		driver.navigate().back();
		driver.navigate().back();
		
		desktopage.getClickonProduct1().click();
		desktopage.getAddtoCompareList().click();
		
		for(WebElement ele:desktopage.getRemovebutton()) {
			try {
				ele.click();
			}catch (StaleElementReferenceException e) {
				ele=driver.findElement(By.xpath("//input[@title='Remove']"));
				ele.click();
			}
			}
		}
		
	}

