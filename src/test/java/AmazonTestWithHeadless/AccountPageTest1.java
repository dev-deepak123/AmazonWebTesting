package AmazonTestWithHeadless;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AmazonPagesWithHeadless.AccountPage1;
import AmazonPagesWithHeadless.AddToCardPage1;
import AmazonPagesWithHeadless.HomePage1;
import AmazonPagesWithHeadless.LoginPage1;

import baseFile.TestBase2;

public class AccountPageTest1 extends TestBase2{
	
	LoginPage1 loginPage;
	HomePage1 homePage;
	AddToCardPage1 addToCardPage;
	AccountPage1 accountPage;
	
	
	public AccountPageTest1() {
		
		super();
	}
	//test Case is independent to each other
	@BeforeMethod
	public void setUp()
	{
		initialization();
	    loginPage = new LoginPage1();
	    addToCardPage = new AddToCardPage1();
	    accountPage = new AccountPage1();
	    homePage = loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
	    accountPage.hoverOnAccountAndList();
    
	}
	
	@Test(priority=0)
	public void verifyYourAccountLableTest() {
		String AccountPageTitle =  accountPage.verifyYourAccountLable();
		Assert.assertEquals(AccountPageTitle,"Your Account");	
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
	public void tearDown() {
		
		driver.quit();
	}

}
