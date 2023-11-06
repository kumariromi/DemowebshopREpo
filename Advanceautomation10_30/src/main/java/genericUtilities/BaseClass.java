package genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;


import objectRepositories.DeskToPage;
import objectRepositories.JewelleryPage;
import objectRepositories.LoginPage;
import objectRepositories.Registerpage;
import objectRepositories.WishListPage;
import objectRepositories.emailErrorMsgPage;
import objectRepositories.removeWishListPage;

public class BaseClass implements IAutoConstants
{
	public static WebDriver driver;
	public static ExtentTest logger;
	public static TakesScreenshotUtility screenshot;
	public static WebDriverutility  webdriverutility;
	public PropertyUtility property;
	public static LoginPage loginpage;
	public static Registerpage registerpage;
	
	public static DeskToPage desktopage ;
	
	public static JewelleryPage jewellerypage;
	public static removeWishListPage removewishlistpage;
	public static emailErrorMsgPage emailerrormsgpage;
	public static WishListPage wishlistpage;
	DatabaseUtility dbUtility;
	JavaUtility javaUtility;


	/**
	 * This method is used to launch the browser, pre-condition
	 */
	@BeforeClass(alwaysRun = true)
	public void launchingBrowserAndNavigateToApp() {
		property=new PropertyUtility();
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver= new ChromeDriver(options);
		}else if(BROWSER.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(property.getDataFromPropertyFile("url"));
		webdriverutility=new WebDriverutility(driver);
		dbUtility=new DatabaseUtility();
		javaUtility=new JavaUtility();
		loginpage=new LoginPage(driver);
		registerpage=new Registerpage(driver);

		desktopage=new DeskToPage(driver);
	
		jewellerypage=new JewelleryPage(driver);
		removewishlistpage =new removeWishListPage(driver);
		emailerrormsgpage=new emailErrorMsgPage(driver);
		wishlistpage=new WishListPage(driver);
	}
	@BeforeMethod(alwaysRun=true)
	public void loginTOApplication() {
		screenshot=new TakesScreenshotUtility(driver);
		System.out.println("logged in to application");
	}
	@AfterMethod(alwaysRun=true)
	public void logoutFromApplication() {
		System.out.println("logged out From Application");

	}
	@AfterClass(alwaysRun=true)
	public void teardownTheBrowser() {
		//driver.quit();
	}
}


