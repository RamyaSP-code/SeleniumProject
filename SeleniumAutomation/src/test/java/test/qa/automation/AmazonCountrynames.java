package test.qa.automation;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AmazonCountrynames extends TestBaseforAMAZON {

		
		@Test
		public void AmazonCountries()
		{
			for(WebElement get:amazon.getCountry())
			{
				Reporter.log(get.getText()+": "+get.getAttribute("href"), true);
			}
		}
	}

