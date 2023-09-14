package AmazonTestWithHeadless;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AmazonPagesWithHeadless.AddToCardPage1;
import AmazonPagesWithHeadless.HomePage1;
import AmazonPagesWithHeadless.LoginPage1;

import baseFile.TestBase2;


public class HomePageTest1 extends TestBase2{
	
	LoginPage1 loginPage;
	HomePage1 homePage;
	AddToCardPage1 addToCardPage;
	
	public HomePageTest1() {
		
		super();
	}
	//test Case is independent to each other
	@BeforeMethod
	public void setUp()
	{
		initialization();
	    loginPage = new LoginPage1();
	    addToCardPage = new AddToCardPage1();
	    homePage = loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
	    
	}
	
	
	@Test(priority=0)
	public void verifyHomePageTitleTest()
	{
		String homePageTitle = homePage.verifyHomePageTitle();
//		SoftAssert sa = new SoftAssert();
		Assert.assertEquals(homePageTitle,"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "Home Page Tittle does't Match");
	
	}
	@Test(priority=1)
	public void verifyUserName() {
		
		Assert.assertTrue(homePage.verifyUserName());;
	}
	@Test(priority = 2)
	public void verifyAddToCardLink() {
		
		addToCardPage = homePage.clickOnAddToCartLink();
		
	}
	@Test(priority = 4)
	public void verifyScrollDownHomePageTest() {
		
		homePage.scrollDownWebpage();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@AfterMethod
	
	public void tearDown() {
		
		driver.quit();
	}
	
	

}
