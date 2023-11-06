package objectRepositories;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class JewelleryPage extends BaseClass {
	public JewelleryPage(WebDriver driver) {

		PageFactory.initElements(driver,this);

	}
	@FindBy(partialLinkText="Jewelry")
	private WebElement Jewelry ;
	
	@FindBy(xpath="//a[@href=\"https://demowebshop.tricentis.com/jewelry?price=0-500\"]")
	private WebElement priceRangeFilter;
	
	@FindBy(xpath="(//div[@class=\"add-info\"])[2]")
	private WebElement jProduct ;
	
	@FindBy(xpath="//div[@class='add-info']")
	private List<WebElement> allPrices;
	
	public WebElement getJewelry() {
		return Jewelry;
	}
	public WebElement getpriceRangeFilter() {
		return priceRangeFilter;
	}
	public WebElement getjProduct() {
		return jProduct;
	}
	public List<WebElement> getAllPrices() {
		return allPrices;
	}



}

