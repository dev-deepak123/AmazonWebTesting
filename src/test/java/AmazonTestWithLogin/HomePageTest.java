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


public class HomePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	AddToCardPage addToCardPage;
	TestUtil testUtil;
	
	public HomePageTest() {
		
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
