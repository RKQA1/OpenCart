package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage
{
	public MyAccountPage(WebDriver driver)
	{ 
		super(driver);
	}

	//Locators
	// MyAccount Page heading
	@FindBy(xpath="//h2[normalize-space()='My Account']") WebElement msgHeading;
	
	//Logout for LoginData drivenTest Case 
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement lnkLogout;

	//Methods
	// MyAccount Page heading display status
	public boolean isMyAccountPageExists()
	{
		try 
		{
			return(msgHeading.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}

	}

 public void clickLogout()
 {
	 lnkLogout.click();
 }

}

