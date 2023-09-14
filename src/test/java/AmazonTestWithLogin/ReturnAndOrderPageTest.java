package AmazonTestWithLogin;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AmazonPagesWithLogin.AddToCardPage;
import AmazonPagesWithLogin.HomePage;
import AmazonPagesWithLogin.LoginPage;
import AmazonPagesWithLogin.ReturnAndOrderPage;
import AmazonPagesWithLogin.SignUpPage;
import baseFile.TestBase;
import utility.TestUtil;

public class ReturnAndOrderPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	AddToCardPage addToCardPage;
	SignUpPage signUpPage;
	ReturnAndOrderPage returnAndOrderPage;
	TestUtil testUtil;
	
	public ReturnAndOrderPageTest() {
		
		super();
	}
	
	//test Case is independent to each other
	@BeforeMethod
	public void setUp()
	{
		initialization();
	    loginPage = new LoginPage();
	    signUpPage = new SignUpPage();
	    homePage  = new HomePage();
	    testUtil = new TestUtil();
	    returnAndOrderPage = new ReturnAndOrderPage();
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
		
	public void screenShot(ITestResult result){
		//using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
		if(ITestResult.FAILURE==result.getStatus()){
		try{
			String str = this.getClass().getName();
			testUtil.takeScreenshotAtEndOfTest(str);
		}catch (Exception e){
		System.out.println("Exception while taking screenshot "+e.getMessage());
		}
		}
		driver.quit();
		}
}



