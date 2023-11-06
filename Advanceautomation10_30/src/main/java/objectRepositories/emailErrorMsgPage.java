package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class emailErrorMsgPage extends BaseClass {
	public emailErrorMsgPage(WebDriver driver) {

		PageFactory.initElements(driver,this);

	}
	@FindBy(partialLinkText="Apparel & Shoes")
	private WebElement ApparelShoeslink ;
	
	@FindBy(xpath="//img[@alt=\"Picture of 50's Rockabilly Polka Dot Top JR Plus Size\"]")
	private WebElement PolkaDotTop ;
	
	@FindBy(xpath="//input[@value='Email a friend']")
	private WebElement emailaFriendButton ;
	
	@FindBy(id="FriendEmail")
	private WebElement enterFriendEmail ;
	
	@FindBy(id="YourEmailAddress")
	private WebElement enteryourEmail;
	
	@FindBy(name="send-email")
	private WebElement sendEmailButton;
	@FindBy(xpath="//li[contains(text(),\"Only registered customers can use email a friend feature\")]")
	private WebElement errorMsg;
	
	public WebElement getApparelShoeslink() {
		return ApparelShoeslink;
	}
	public WebElement getPolkaDotTop() {
		return PolkaDotTop;
	}
	public WebElement getEmailaFriendButton() {
		return emailaFriendButton;
	}
	public WebElement getEnterFriendEmail() {
		return enterFriendEmail;
	}
	
	
	public WebElement getEnteryourEmail() {
		return enteryourEmail;
	}
	public WebElement getSendEmailButton() {
		return sendEmailButton;
	}
	public WebElement getErrorMsg() {
		return errorMsg;
	}
	
}
