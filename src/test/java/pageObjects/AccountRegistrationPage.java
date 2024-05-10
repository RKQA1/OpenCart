package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage
{
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}


	//Locators
	//FirstNanme
	@FindBy(xpath="//input[@id='input-firstname']") 
	WebElement txt_firstName_loc;

	//LastAnme
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txt_lastName_loc;

	//Email
	@FindBy(xpath = "//input[@id='input-email']") 
	WebElement txt_email_loc;
	
	//TelePhone
	@FindBy(xpath = "//input[@id='input-telephone']") 
	WebElement txt_telPh_loc;
	

	//Password
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txt_password_loc;
	
	//CofirmPassword
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txt_confpassword_loc;

	//PolicyChkBox
	@FindBy(xpath="//input[@name='agree']")
	WebElement chked_policy_loc;

	//Continue
	@FindBy(xpath="//input[@value='Continue']") 
	WebElement btn_continue_loc;

	//Msgconfirmation
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

	//Methods
	public void setFirstName(String fName)
	{
		txt_firstName_loc.sendKeys(fName);
	}

	public void setLastName(String lName)
	{
		txt_lastName_loc.sendKeys(lName);
	}

	public void setEmail(String email)
	{
		txt_email_loc.sendKeys(email);
	}
	
	public void setTelephone(String ph)
	{
		txt_telPh_loc.sendKeys(ph);
	}
	
	public void setPassword(String pwd)
	{
		txt_password_loc.sendKeys(pwd);
	}

	public void setConfPassword(String confpwd)
	{
		txt_confpassword_loc.sendKeys(confpwd);
	}
	public void chkPolicy()
	{
		chked_policy_loc.click();
	}

	public void btnContinue()
	{   
		//sol1
		btn_continue_loc.click();
		/*	
		//sol2
		btn_continue_loc.submit();

		//sol3
		Actions act = new Actions(driver);
		act.moveToElement(btn_continue_loc).click().perform();

		//sol4
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("argument[0].click();",btn_continue_loc);

		//sol5
		btn_continue_loc.sendKeys(Keys.RETURN);

		//sol6
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.elementToBeClickable(btn_continue_loc)).click();

		 */
	}

	//Confirmation msg
	public String getConfirmationMsg()
	{
		try 
		{
			return(msgConfirmation.getText());	
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}


	}
}
