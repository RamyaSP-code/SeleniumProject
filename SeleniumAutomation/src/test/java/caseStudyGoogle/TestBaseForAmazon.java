package caseStudyGoogle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBaseForAmazon {
	WebDriver driver;
	AmazonPage ap;
	@BeforeClass
public void setup()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Ramya\\chromedriver.exe");
	 driver=new ChromeDriver();
	 ap=new AmazonPage(driver);
	 driver.get("https://www.amazon.in/");
}
	@AfterClass
public void TearDown()
{
	driver.close();
}
}
