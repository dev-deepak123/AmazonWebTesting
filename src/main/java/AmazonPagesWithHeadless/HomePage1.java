package AmazonPagesWithHeadless;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import baseFile.TestBase2;

public class HomePage1 extends TestBase2 {
	
	@FindBy(xpath ="//*[@id=\"nav-link-accountList-nav-line-1\"]")
	WebElement userNameLable;
	
	@FindBy(xpath ="//*[@id=\"nav-cart\"]")
	WebElement addToCartLink;
	
	@FindBy(xpath ="//*[@id=\"nav-orders\"]")
	WebElement showOrderLink;
	
	@FindBy(xpath ="//*[@id=\"nav-global-location-popover-link\"]")
	WebElement deliveryAddressLink;
	
	@FindBy(xpath="//*[@id=\"nav-orders\"]")
	WebElement returnAndOrderLable;
	
	public HomePage1() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		
		return driver.getTitle();
	}
	
	public boolean verifyUserName() {
		
		return userNameLable.isDisplayed();
	}
    public AddToCardPage1 clickOnAddToCartLink (){
    	
    	
    	addToCartLink.click();
    	return new AddToCardPage1();
	}
    
    public ReturnAndOrderPage1 clickOnShowOrderLink (){
		
    	showOrderLink.click();
    	return new ReturnAndOrderPage1();
	}
    
    public DeliverAddressPage1 clickOnDeliveryAddressLink (){
		
    	deliveryAddressLink.click();
    	return new DeliverAddressPage1();
	}
    
    public ReturnAndOrderPage1 clickOnReturnAndOrderPage (){
		
    	returnAndOrderLable.click();
    	return new ReturnAndOrderPage1();
	}
    
    public void scrollDownWebpage() {
    	
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("window.scroll(0,document.body.scrollHeight)");
    }
	
	
	

}
