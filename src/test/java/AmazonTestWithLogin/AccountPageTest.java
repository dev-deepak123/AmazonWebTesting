package AmazonTestWithLogin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AmazonPagesWithLogin.AccountPage;
import AmazonPagesWithLogin.AddToCardPage;
import AmazonPagesWithLogin.HomePage;
import AmazonPagesWithLogin.LoginPage;

import baseFile.TestBase;
import utility.TestUtil;

public class AccountPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	AddToCardPage addToCardPage;
	AccountPage accountPage;
	TestUtil testUtil;
	
	
	public AccountPageTest() {
		
		super();
	}
	//test Case is independent to each other
	@BeforeMethod
	public void setUp()
	{
		initialization();
	    loginPage = new LoginPage();
	    addToCardPage = new AddToCardPage();
	    accountPage = new AccountPage();
	    testUtil = new TestUtil();
	    homePage = loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
	    accountPage.hoverOnAccountAndList();
    
	}
	
	@Test(priority=0)
	public void verifyYourAccountLableTest() {
		String AccountPageTitle =  accountPage.verifyYourAccountLable();
		Assert.assertEquals(AccountPageTitle,"1Your Account");	
	}
	
	@Test(priority=1)
	public void verifyYourOrderBoxInAccountPageTest() {
		accountPage.verifyYourOrderBoxLinkLable();
		
	}
	
	@Test(priority=2)
	public void verifyLoginAndSecurityinAccountPageTest() {
		accountPage.verifyLoginAndSecurityLable();
		
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


