package AmazonEndTOEnd;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
public class TestBaseProgram {
	
				WebDriver driver;	
				Amazonpage page;
				@Parameters({"Browser","Url"})
				@BeforeClass
				public void setup(String Browser,String Url)
				{
					if(Browser.equalsIgnoreCase("Chrome"))
					{
						System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Ramya\\chromedriver.exe");

						driver=new ChromeDriver();
						driver.manage().window().maximize();
					}
					if(Browser.equalsIgnoreCase("Edge"))
					{
						System.setProperty("webdriver.edge.driver", "S:\\Virtusa\\Softwares\\Drivers\\edgedriver_win64_2\\msedgedriver.exe");
						driver=new EdgeDriver();
					}
					page=new Amazonpage(driver);
					ExcelUtility e=new ExcelUtility();
					driver.get(Url);
					driver.manage().window().maximize();
					page.getSignin().click();
					page.getEmail().sendKeys("ramyaparu1999@gmail.com");
					page.getContinue().click();
					page.getPassword().sendKeys("8105567249");
					page.getSubmit().click();
				}
				@AfterClass
				public void tearDown()
				{
					page.getCart().click();
					page.getBuy().click();
					driver.navigate().back();
					page.getHome().click();
					page.getSideTab().click();
					page.getSignOut().click();
					driver.quit();
				}
			}


