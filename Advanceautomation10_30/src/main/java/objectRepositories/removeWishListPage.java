package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class removeWishListPage {

	public removeWishListPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@name=\"removefromcart\"]")
	private WebElement productCheckBox;
	
	@FindBy(xpath="//input[@value=\"Update wishlist\"]")
	private WebElement updateWishlist;
	
	public  WebElement getProductCheckBox() {
		return productCheckBox;
	}
	public  WebElement getUpdateWishList() {
		return updateWishlist;
	}
}
