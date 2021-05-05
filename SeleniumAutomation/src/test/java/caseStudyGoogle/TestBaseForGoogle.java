package caseStudyGoogle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestBaseForGoogle {
	WebDriver driver;
	Gp g;
	//@Parameters({"Browser"})
@BeforeClass
//public void setup( String Browser,String url) {
		//if(Browser.equalsIgnoreCase("chrome")) {
public void setup( ) {

System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Ramya\\chromedriver.exe");
 driver=new ChromeDriver();
		//}
	//	else if(Browser.equalsIgnoreCase("firefox"))
		//{
			////System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Ramya\\chromedriver.exe");
			 driver=new FirefoxDriver();
		//}
 g=new Gp(driver);
		//launch the google url
	    driver.get("https://www.google.com./");
}
@AfterClass
public void TearDown() {
	driver.close();
}

}
