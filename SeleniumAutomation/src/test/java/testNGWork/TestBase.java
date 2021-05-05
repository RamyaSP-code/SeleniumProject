package testNGWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
	WebDriver driver;
	Rediff rf;
	@BeforeClass
public void SetUp()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Ramya\\chromedriver.exe");
	 driver=new ChromeDriver();
     //launch the rediff url
		 rf=new Rediff(driver);

     driver.get("https://www.rediff.com/");
}
	@AfterClass
public void TearDown()
{
    driver.quit();
}
}
