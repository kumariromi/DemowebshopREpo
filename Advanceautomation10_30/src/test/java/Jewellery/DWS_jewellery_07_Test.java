package Jewellery;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_jewellery_07_Test extends BaseClass {
	@Test
public void compareJewelleryPrice() {
		jewellerypage.getJewelry().click();
	String productPriceRangeFilter=jewellerypage.getpriceRangeFilter().getText();
	jewellerypage.getpriceRangeFilter().click();

	String S1=productPriceRangeFilter.substring(7,10);
	int productPriceRange=Integer.parseInt(S1);
	
	int strnum = 0;
	for(WebElement price:jewellerypage.getAllPrices()) {
		String substr = price.getText().substring(0, price.getText().length()-3);
		strnum=Integer.parseInt(substr);
		System.out.println(strnum);
	}
	assertTrue(strnum<=productPriceRange);
	System.out.println("All products within range");
	logger.log(Status.INFO,"Yes, Jewellery is within selected Range");
	}
}

