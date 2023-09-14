package AmazonPagesWithHeadless;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AmazonPagesWithLogin.HomePage;
import baseFile.TestBase2;

public class DeliveryPage extends TestBase2{
	
	@FindBy(xpath ="//*[@id=\"nav-global-location-popover-link\"]")
	WebElement deliveryAddressLable;
	
	@FindBy(xpath ="//*[@id=\"GLUXZipUpdateInput\"]")
	WebElement deliveryAddressPin;
	
	@FindBy(xpath ="//*[@id=\"GLUXZipUpdate\"]/span/input")
	WebElement deliveryAddressApplyButton;
	
	public DeliveryPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public HomePage enterPinCode(String pincode) {
		deliveryAddressLable.click();
		deliveryAddressPin.sendKeys(pincode);
		deliveryAddressApplyButton.click();
		return new HomePage();
	
	}

}
