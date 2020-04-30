package ExtentReports.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test1 extends BaseClass{

	WebDriver driver;
	
	@Test
	public void initialDemo()
	{
		driver = initializeDriver();
		driver.get("https://www.rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		driver.close();
	}
	
}
