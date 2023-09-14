package AmazonTestWithHeadless;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AmazonPagesWithHeadless.AddToCardPage1;
import AmazonPagesWithHeadless.HomePage1;
import AmazonPagesWithHeadless.LoginPage1;

import baseFile.TestBase2;

public class AddToCartTest1 extends TestBase2{
	
	LoginPage1 loginPage;
	HomePage1 homePage;
	AddToCardPage1 addToCardPage;
	
	public AddToCartTest1() {
		
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
//	    addToCardPage = homePage.clickOnAddToCartLink();
	    
	}
	
	@Test
	public void verifyAddTocardLableTest() {
//		Assert.assertTrue(addToCardPage.verifyAddToCartLable(),"Add to card lable is missing");
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}
