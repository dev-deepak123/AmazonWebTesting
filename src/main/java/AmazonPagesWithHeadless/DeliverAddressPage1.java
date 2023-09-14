package AmazonPagesWithHeadless;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import baseFile.TestBase2;

public class DeliverAddressPage1 extends TestBase2{
	
//	@FindBy(xpath ="//*[@id=\"nav-global-location-popover-link\"]")
//	WebElement deliveryAddressLable;
//	
//	@FindBy(xpath ="/html/body/div[4]/div/div/div/div/div[2]/div[3]/div[2]/div/div[1]/input")
//	WebElement deliveryAddressPin;
//	
//	@FindBy(xpath ="//*[@id=\"GLUXZipUpdate\"]/span/input")
//	WebElement deliveryAddressApplyButton;
	
	@FindBy(xpath ="//*[@id=\"nav-global-location-popover-link\"]")
	WebElement deliveryAddressLable;
	
	@FindBy(xpath ="//*[@id=\"GLUXZipUpdateInput\"]")               
	WebElement deliveryAddressPin;
	
	@FindBy(xpath ="//*[@id=\"GLUXZipUpdate\"]/span/input")
	WebElement deliveryAddressApplyButton;
	
	public DeliverAddressPage1() {
			
			PageFactory.initElements(driver, this);
		}
	
//	/
	
	public HomePage1 enterPinCode(String pincode) {
		deliveryAddressLable.click();
		deliveryAddressPin.sendKeys(pincode);
		deliveryAddressApplyButton.click();
		return new HomePage1();
		
		
		
	}
	

}
