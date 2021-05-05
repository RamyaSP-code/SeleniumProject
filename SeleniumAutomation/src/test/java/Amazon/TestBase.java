package Amazon;


	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Parameters;

	
	public class TestBase 
	{
		WebDriver driver;
		
		ScrollDownAmazonProject scroll;
		JavascriptExecutor js;
		@Parameters({"Browser","Url"})
		@BeforeClass
		public void setup(String Browser,String Url)
		{
			if(Browser.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Ramya\\chromedriver.exe");

				driver=new ChromeDriver();
				js=(JavascriptExecutor) driver;
				driver.manage().window().maximize();
			}
			if(Browser.equalsIgnoreCase("Edge"))
			{
				System.setProperty("webdriver.edge.driver", "S:\\Virtusa\\Softwares\\Drivers\\edgedriver_win64_2\\msedgedriver.exe");
				driver=new EdgeDriver();
			}
			scroll=new ScrollDownAmazonProject(driver);
			
			driver.get(Url);
		}
		@AfterClass
		public void tearDown()
		{
			driver.close();
			driver.quit();
		}
	}

