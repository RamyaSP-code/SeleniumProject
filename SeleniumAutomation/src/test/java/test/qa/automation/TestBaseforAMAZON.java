package test.qa.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestBaseforAMAZON {
	WebDriver driver;
	CountrynamesinAMAZON amazon;
	@Parameters({"browser","url"})
	
	@BeforeClass
public void setup(String browser,String url)
{
	if(browser.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Ramya\\chromedriver.exe");
	 driver=new ChromeDriver();
	}
	if(browser.equalsIgnoreCase("Edge"))
	{
		System.setProperty("webdriver.edge.driver", "S:\\Virtusa\\Softwares\\Drivers\\edgedriver_win64_2\\msedgedriver.exe");
		driver=new EdgeDriver();
	}
	 amazon=new CountrynamesinAMAZON(driver);
	 driver.get(url);
}
	@AfterClass
public void TearDown()
{
	driver.close();
}

}
