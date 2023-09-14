package AmazonTestWithHeadless;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AmazonPagesWithHeadless.DeliveryPage;

import baseFile.TestBase2;

public class DeliveyPageTest1 extends TestBase2{
	
	
	DeliveryPage deliveryPage;
	
	public DeliveyPageTest1() {
		
		super();
	}
	//test Case is independent to each other
	@BeforeMethod
	public void setUp()
	{
		initialization();
		deliveryPage = new DeliveryPage();
   
	}
	
	@Test
	public void verifyDeliveryTest() {
		
		deliveryPage.enterPinCode(prop.getProperty("pincode"));
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}


