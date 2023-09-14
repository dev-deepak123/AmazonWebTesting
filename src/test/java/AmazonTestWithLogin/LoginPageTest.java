package AmazonTestWithLogin;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AmazonPagesWithLogin.HomePage;
import AmazonPagesWithLogin.LoginPage;
import baseFile.TestBase;
import utility.TestUtil;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	public LoginPageTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	    loginPage = new LoginPage();
	    testUtil = new TestUtil();
	}
	@Test(priority = 1)
	public void loginTest() 
	{
		homePage=loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
	}
	@Test(priority = 0)
	public void loginPageTitleTest()
	{
		String title = loginPage.validationLoginPage();
//		SoftAssert sa = new SoftAssert();
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
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
