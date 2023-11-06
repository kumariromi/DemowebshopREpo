package objectRepositories;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class DeskToPage {
	

	public DeskToPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText ="Computers")
	private WebElement computerClick;
	
	@FindBy(linkText ="Desktops")
	private WebElement DesktopsClick;
	
	@FindBy(linkText = "Build your own computer")
	private WebElement clickonProduct;
	
	@FindBy(xpath="//input[@value='Add to compare list']")
	private WebElement addtoCompareList;
	
	@FindBy(linkText ="Build your own cheap computer")
	private WebElement clickonProduct1;
	
	@FindBy(xpath="//input[@title='Remove']")
	private List<WebElement> removebutton;
	
	public List<WebElement> getRemovebutton() {
		return removebutton;
	}
	
	public WebElement getComputerClick() {
		return computerClick;
		
	}
	public WebElement getDesktopsClick() {
		return DesktopsClick;
	}
	public WebElement getClickonProduct() {
		return clickonProduct;
	}
	public WebElement getAddtoCompareList() {
		return addtoCompareList;
	}

	public WebElement getClickonProduct1() {
		return clickonProduct1;
	}
	
	
	
}
