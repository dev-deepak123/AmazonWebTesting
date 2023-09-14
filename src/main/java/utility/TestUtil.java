package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



import baseFile.TestBase;

public class TestUtil extends TestBase{
	
	public static long IMPLICIT_WAIT=10;

	public static long PAGE_LOAD_TIMEOUT=10;

	
	
	public  void takeScreenshotAtEndOfTest(String className) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
//		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
		FileUtils.copyFile(scrFile, new File("\\Users\\deepakvishwakarma\\eclipse-workspace\\SeleniumAssignment\\screenshots\\" +"failshot_"+className+"_"+".png"));
		//currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"
		//currentDir+"failshot_"+this.getClass().getName()+"_"+".jpg"
	}
}
