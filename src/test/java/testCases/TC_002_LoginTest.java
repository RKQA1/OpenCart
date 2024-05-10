package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass
{
	@Test(groups= {"Sanity","Master"})
	public void verify_Account_Login()
	{
		logger.info("***********Starting TC_002_LoginTest***********");
		logger.debug("This is a debug log mesaage");
		try
		{
			//Home Page
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			logger.info("Clicked on MyAccount link on Home Page");
			hp.clickLogin();
			logger.info("Clicked on Login under MyAccount");

			//Login Page
			LoginPage lp = new LoginPage(driver);
			logger.info("Entering Valid Email Address and Password");
			lp.setEmail(p.getProperty("email"));
			logger.info("Entered Email Address");
			lp.setPwd(p.getProperty("password"));
			logger.info("Entered Email Password");
			lp.clickLogin();
			logger.info("Clicked on Login button");

			//MyAccountPage
			MyAccountPage macc  = new MyAccountPage(driver);
			boolean targetPage = macc.isMyAccountPageExists();

			//Validate if My Acoount Page Exist
			if(targetPage==true)
			{
				logger.info("Login Successful... Test Passed");
				Assert.assertEquals(targetPage , true ,"Login Successful... Test Passed");

			}
			else
			{
				logger.info("Login Failed...Test Failed");
				Assert.fail("Login Failed...Test Failed");
			}

		}
		catch(Exception e)
		{

		}
		finally
		{
			logger.info("**********Finished TC_002_LoginTest*********");
		}
	}
}

