package AmazonTestWithHeadless;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AmazonPagesWithHeadless.AddToCardPage1;
import AmazonPagesWithHeadless.DeliverAddressPage1;
import AmazonPagesWithHeadless.HomePage1;
import AmazonPagesWithHeadless.LoginPage1;

import baseFile.TestBase2;

public class DeliverAddressPageTest1 extends TestBase2{
	
	LoginPage1 loginPage;
	HomePage1 homePage;
	AddToCardPage1 addToCardPage;
	DeliverAddressPage1 deliverAddressPage ;
	public DeliverAddressPageTest1() {
		
		super();
	}
	//test Case is independent to each other
	@BeforeMethod
	public void setUp()
	{
		initialization();
	    loginPage = new LoginPage1();
	    deliverAddressPage = new DeliverAddressPage1();
	    homePage = loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));

	    
	}
	
	@Test
	public void verifyDeliveryPageTest() {
	  deliverAddressPage.enterPinCode(prop.getProperty("pincode"));

	}
	

	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}
