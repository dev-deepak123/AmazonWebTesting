package AmazonTestWithHeadless;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AmazonPagesWithHeadless.AddToCardPage1;
import AmazonPagesWithHeadless.HomePage1;
import AmazonPagesWithHeadless.LoginPage1;
import AmazonPagesWithHeadless.ReturnAndOrderPage1;
import AmazonPagesWithHeadless.SignUpPage1;

import baseFile.TestBase2;

public class ReturnAndOrderPageTest1 extends TestBase2 {
	
	LoginPage1 loginPage;
	HomePage1 homePage;
	AddToCardPage1 addToCardPage;
	SignUpPage1 signUpPage;
	ReturnAndOrderPage1 returnAndOrderPage;
	
	public ReturnAndOrderPageTest1() {
		
		super();
	}
	
	//test Case is independent to each other
	@BeforeMethod
	public void setUp()
	{
		initialization();
	    loginPage = new LoginPage1();
	    signUpPage = new SignUpPage1();
	    homePage  = new HomePage1();
	    returnAndOrderPage = new ReturnAndOrderPage1();
	    homePage = loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
	    homePage.clickOnReturnAndOrderPage();
	         
	    
	}
	@Test
	
	public void verifyResturnAndOrderPageTest() throws InterruptedException {
		
		Thread.sleep(3000);
		returnAndOrderPage.verifyOrderlable(); 	
		
		returnAndOrderPage.verifyNotYetShippedlable();
		
		returnAndOrderPage.verifyBuyAgainlable();
		
		returnAndOrderPage.verifyCancelOrderlable();
	 
	}
	
	
	@AfterMethod
		
		public void tearDown()
		{
			driver.quit();
		}


}
