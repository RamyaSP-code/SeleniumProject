package Amazon;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	 public class ScrollDownAmazonProject{

		WebDriver driver;
		
		@FindBy(linkText = "Careers")
		WebElement careers;
		
		public WebElement getCareers()
		{
			return careers;
		}
		public ScrollDownAmazonProject(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	}


