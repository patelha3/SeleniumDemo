package ExtentReports.ExtentReports;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public WebDriver driver;

	public WebDriver initializeDriver()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public String getScreenshotPath(String TestCaseName,WebDriver driver) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+ "\\reports\\" + TestCaseName + ".png";
		FileUtils.copyFile(src, new File (path));
		return path;
	}
}
