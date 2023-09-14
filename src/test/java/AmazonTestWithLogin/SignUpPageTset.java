package AmazonTestWithLogin;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import AmazonPagesWithLogin.AddToCardPage;
import AmazonPagesWithLogin.HomePage;
import AmazonPagesWithLogin.LoginPage;
import AmazonPagesWithLogin.SignUpPage;
import baseFile.TestBase;
import utility.TestUtil;

public class SignUpPageTset extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	AddToCardPage addToCardPage;
	SignUpPage signUpPage;
	TestUtil testUtil;
	
	public SignUpPageTset() {
		
		super();
	}
	//test Case is independent to each other
	@BeforeMethod
	public void setUp()
	{
		initialization();
	    loginPage = new LoginPage();
	    signUpPage = new SignUpPage();
	    testUtil = new TestUtil();
	    homePage = loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
	         
	    
	}
	@Test
	 public void verifySignUpPageTest() {
		
		signUpPage.signUpAmazonAccount();
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



