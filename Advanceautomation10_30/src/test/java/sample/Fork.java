package sample;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
@Test
public class Fork extends BaseClass{
	public void  Fork() {
		driver.navigate().to("https://www.facebook.com");
		
			}
}
