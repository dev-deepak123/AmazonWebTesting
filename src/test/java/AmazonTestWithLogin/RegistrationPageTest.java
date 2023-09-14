package AmazonTestWithLogin;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import AmazonPagesWithLogin.RegistrationPage;

import baseFile.TestBase;
import utility.TestUtil;

public class RegistrationPageTest extends TestBase{
	
	RegistrationPage registrationPage;
	TestUtil testUtil;
	
	public RegistrationPageTest() {
		
		super();
	}
	
	//test Case is independent to each other
	@BeforeMethod
	public void setUp()
	{
		initialization();
		registrationPage   = new RegistrationPage();
		testUtil = new TestUtil();
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
