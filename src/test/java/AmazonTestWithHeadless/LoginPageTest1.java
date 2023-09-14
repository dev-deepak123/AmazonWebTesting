package AmazonTestWithHeadless;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AmazonPagesWithHeadless.HomePage1;
import AmazonPagesWithHeadless.LoginPage1;

import baseFile.TestBase2;

public class LoginPageTest1 extends TestBase2{
	LoginPage1 loginPage;
	HomePage1 homePage;
	
	public LoginPageTest1() {
		
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	    loginPage = new LoginPage1();
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
	
	public void tearDown()
	{
		driver.quit();
	}

}
