package test.qa.automation;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CountrynamesinAMAZON {
WebDriver driver;
@FindAll(@FindBy(xpath = "//body/div[@id='a-page']/div[@id='navFooter']/div[4]/ul[1]/li/a"))
List<WebElement>Country;
public List<WebElement>getCountry()
{
	return Country;
}
public CountrynamesinAMAZON(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
}
