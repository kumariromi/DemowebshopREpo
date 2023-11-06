package Wishlist;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_RemoveWishList_10_Test extends BaseClass {
	@Test

	public void removefromWishList() {
		jewellerypage.getJewelry().click();
		wishlistpage.getSelectJewellery().click();
		wishlistpage.getWishListButton().click();
		wishlistpage.getWishlistlink().click();
		removewishlistpage.getProductCheckBox().click();
		removewishlistpage.getUpdateWishList().click();
		boolean flag=true;
		try {
			removewishlistpage.getProductCheckBox();
		}
			catch(Exception e) {
				flag=false;
				e.printStackTrace();
			}
			if(flag==false) {
				System.out.println("wishlist is empty");
			}
	}
}
		