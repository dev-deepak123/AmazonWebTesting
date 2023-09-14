package AmazonTestWithLogin;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AmazonPagesWithLogin.AddToCardPage;
import AmazonPagesWithLogin.HomePage;
import AmazonPagesWithLogin.LoginPage;
import baseFile.TestBase;
import utility.TestUtil;

public class AddToCartTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	AddToCardPage addToCardPage;
	TestUtil testUtil;
	
	public AddToCartTest() {
		
		super();
	}
	//test Case is independent to each other
	@BeforeMethod
	public void setUp()
	{
		initialization();
	    loginPage = new LoginPage();
	    addToCardPage = new AddToCardPage();
	    testUtil = new TestUtil();
	    homePage = loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
	    addToCardPage = homePage.clickOnAddToCartLink();
	    
	}
	
	@Test
	public void verifyAddTocardLableTest() {
		Assert.assertTrue(addToCardPage.verifyAddToCartLable(),"Add to card lable is missing");
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
