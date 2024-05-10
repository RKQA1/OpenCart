package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{

	public HomePage(WebDriver driver)
	{
		super(driver); //invokes BaseClass constructor
	}

	//Locators
	//My Account
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement lnkMyAccount;

	//Register
	@FindBy(xpath="//a[normalize-space()='Register']") 
	WebElement lnkRegister;

	//Login
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")
	WebElement lnkLogin;

	//Methods
	//MyAccount
	public void clickMyAccount()
	{
		lnkMyAccount.click();
	}

	//Register
	public void clickRegister()
	{
		lnkRegister.click();
	}

	//Login
	public void clickLogin()
	{
		lnkLogin.click();
	}
}


