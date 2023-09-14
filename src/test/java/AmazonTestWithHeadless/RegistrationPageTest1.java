package AmazonTestWithHeadless;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import AmazonPagesWithHeadless.RegistrationPage1;

import baseFile.TestBase2;

public class RegistrationPageTest1 extends TestBase2{
	
	RegistrationPage1 registrationPage;
	
	public RegistrationPageTest1() {
		
		super();
	}
	
	//test Case is independent to each other
	@BeforeMethod
	public void setUp()
	{
		initialization();
		registrationPage   = new RegistrationPage1();
		registrationPage.registration("Deepak","56897655","9088775544", "Vishwakarmaji855@gmail.com");
		
 
	}
	@DataProvider
	public void getDataProvider()
	{
		
	}
	@Test
	public void verifyRegistrationPageTest() {
	
	}
	
	@AfterMethod
	
	public void tearDown()
	{
//		driver.quit();
	}

}
