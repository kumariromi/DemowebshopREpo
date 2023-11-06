package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class LoginPage extends BaseClass {
	
		public LoginPage(WebDriver driver) {
			
			PageFactory.initElements(driver,this);
		}
		@FindBy(linkText="Log in")
		private WebElement Login;
			
		@FindBy(id="Email")
		private WebElement email;
			
		@FindBy(id="Password")
		private WebElement password;
			
		@FindBy(id ="RememberMe")
		private WebElement RememberMe;
		@FindBy(xpath="//input[@class='button-1 login-button']")
		private WebElement LoginBtn;
		
		public WebElement getEmail() {
			return email;
		}
		public WebElement getLogin() {
			return Login;
		}
		public WebElement getPassword() {
			return password;
		}
		
		public WebElement getRememberMe() {
			return RememberMe;
		}
		public WebElement getLoginBtn() {
			return LoginBtn;
		}


}
