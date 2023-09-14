package AmazonPagesWithLogin;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseFile.TestBase;

public class HomePage extends TestBase {
	
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
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		
		return driver.getTitle();
	}
	
	public boolean verifyUserName() {
		
		return userNameLable.isDisplayed();
	}
    public AddToCardPage clickOnAddToCartLink (){
    	
    	
    	addToCartLink.click();
    	return new AddToCardPage();
	}
    
    public ReturnAndOrderPage clickOnShowOrderLink (){
		
    	showOrderLink.click();
    	return new ReturnAndOrderPage();
	}
    
    public DeliverAddressPage clickOnDeliveryAddressLink (){
		
    	deliveryAddressLink.click();
    	return new DeliverAddressPage();
	}
    
    public ReturnAndOrderPage clickOnReturnAndOrderPage (){
		
    	returnAndOrderLable.click();
    	return new ReturnAndOrderPage();
	}
    
    public void scrollDownWebpage() {
    	
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("window.scroll(0,document.body.scrollHeight)");
    }
	
	
	

}
