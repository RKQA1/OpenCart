package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}

	//Locators
	@FindBy(xpath="//input[@id='input-email']") WebElement txt_email_loc;
	@FindBy(xpath="//input[@id='input-password']") WebElement txt_pwd_loc;
	@FindBy(xpath="//input[@value='Login']") WebElement btn_login_loc;

	//Methods
	public void setEmail(String email)
	{
		txt_email_loc.sendKeys(email);
	}

	public void setPwd(String pwd)
	{
		txt_pwd_loc.sendKeys(pwd);
	}

	public void clickLogin()
	{
		btn_login_loc.click();
	}


}
