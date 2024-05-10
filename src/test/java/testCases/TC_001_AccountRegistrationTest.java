package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass

{
	@Test(groups= {"Master","Regression"})
	public void verify_account_registration() throws InterruptedException
	{
		logger.info("*******Starting TC_001_AccountRegistrationTest*********");
		logger.debug("This is a debug log mesaage");
		try 
		{
		//HomePage
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on MyAccount Link");
		
		hp.clickRegister();
        logger.info("Clicked on Register Link"); 
        
		//Registration Page
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		regpage.setFirstName(randomeString());
		regpage.setLastName(randomeString());
		regpage.setEmail(randomeString()+"@gmail.com");
		regpage.setTelephone(randomeNumber());
		
	    String password=randomeAlphaNumeric();
		regpage.setPassword(password);
		regpage.setConfPassword(password);
		
		regpage.chkPolicy();
		regpage.btnContinue();
		logger.info("Clicked on Continue Button for Account creation");
		Thread.sleep(2000);
		String confmsg = regpage.getConfirmationMsg();
		logger.info("Validating Expected message");
		if(confmsg.equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
			
		}
		else
		{
			 logger.error("Test Failed :"); 
			 logger.debug("Debug logs: ");
			Assert.assertTrue(false);
		}
		
		logger.info("Test Passed");
		}
		catch(Exception e)
		{
		 
		 Assert.fail("Test Failed :" +e.getMessage());
		}
		
		finally
		{
			logger.info("*********Finished Tc_001_AccountRegistrationTest*******");
		}


	}
}
