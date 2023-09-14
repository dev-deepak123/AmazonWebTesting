package AmazonPagesWithHeadless;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import baseFile.TestBase2;

public class AddToCardPage1 extends TestBase2 {
	
//	@FindBy(xpath="//*[@id=\"sc-active-cart\"]/div/div[1]/div/h1")
//	WebElement addToCardEmptyLable;
//	
	@FindBy(xpath="//*[@id=\"sc-active-cart\"]/div/div[1]/div[1]/h1")
	WebElement addToCardLable;
	
	
	//initializing the page object
	public AddToCardPage1() {
		PageFactory.initElements(TestBase2.driver, this);
	}
	
	public boolean verifyAddToCartLable() {
		return addToCardLable.isDisplayed();
	}
//  
	
//	public void verifyCard(String name) {
//		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[4]/div/div[2]/div[1]/div/div[1]/+"+name+"+/h1"));
//	}
	
}
