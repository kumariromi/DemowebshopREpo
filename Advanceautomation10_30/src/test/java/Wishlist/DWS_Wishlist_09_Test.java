package Wishlist;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_Wishlist_09_Test extends BaseClass{
	@Test
	public void addProductToWishlist() {
		jewellerypage.getJewelry().click();
		wishlistpage.getSelectJewellery().click();
		wishlistpage.getWishListButton().click();
		wishlistpage.getWishlistlink().click();
		assertTrue(wishlistpage.getSelectJewellery().isDisplayed());
		System.out.println("Jewellery added to wishlist");
	}

}
