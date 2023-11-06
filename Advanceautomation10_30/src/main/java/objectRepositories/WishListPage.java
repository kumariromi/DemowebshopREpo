package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class WishListPage extends BaseClass {

public WishListPage(WebDriver driver) {
	
	PageFactory.initElements(driver,this);
}
@FindBy(linkText="Black & White Diamond Heart")
private WebElement selectJewellery;
@FindBy(id="add-to-wishlist-button-14")
private WebElement WishListButton;
@FindBy(linkText="Wishlist")
private WebElement wishlistlink;

public  WebElement getSelectJewellery() {
	return selectJewellery;
}
public  WebElement getWishListButton() {
	return WishListButton;
	
}
public  WebElement getWishlistlink() {
	return wishlistlink;
	
}
}




