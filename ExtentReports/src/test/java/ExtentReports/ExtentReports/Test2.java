package ExtentReports.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 extends BaseClass{

	WebDriver driver;
	
	@Test
	public void googleTitleValidation()
	{
		driver = initializeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		//Assert.assertTrue(false);
		driver.close();
	}
}
