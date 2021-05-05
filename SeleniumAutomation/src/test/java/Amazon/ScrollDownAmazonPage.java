package Amazon;

	import org.testng.Reporter;
	import org.testng.annotations.Test;

	
	public class ScrollDownAmazonPage extends TestBase {
		
		@Test
		public void scroll() throws InterruptedException
		{
			js.executeScript("window.scrollBy(0,500)",scroll.getCareers());
			Thread.sleep(5000);
			scroll.getCareers().click();
			if(driver.getCurrentUrl().contains("jobs"))
			{
				Reporter.log("We are on the jobs page ", true);
			}
			else
			{
				Reporter.log("We are not on the jobs page ", true);
			}
		}
	}
