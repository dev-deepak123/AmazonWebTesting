package baseFile;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import utility.TestUtil;

public class TestBase2 {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	
	
	public TestBase2()
	{
		try {
			
			prop = new Properties();
			FileInputStream ip = new FileInputStream("\\Users\\deepakvishwakarma\\eclipse-workspace\\SeleniumAssignment\\src\\main\\java\\configProperties\\config.properties");
			prop.load(ip);

		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
	public static void initialization()
	{
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\BrowserDriver\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("window-size=1400,800");
			options.addArguments("headless");
		    driver = new ChromeDriver(options);
		}
		
		else if(browserName.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\BrowserDriver\\gekoDriver.exe");
		    driver = new ChromeDriver();
		}
		
		
		

//		// Maximize the window
//		driver.manage().window().maximize();
		
		//wait for page load
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));

		// Applying implicit waits
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
		
		//going to url
		driver.get(prop.getProperty("url"));
				
				
		
	}

}

