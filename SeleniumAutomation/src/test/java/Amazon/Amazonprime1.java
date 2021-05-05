package Amazon;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import AmazonEndTOEnd.ExcelUtility;

public class Amazonprime1 extends tBase{
@Test(priority=1)
public void Shop() throws InterruptedException 
{

	page.getSignin().click();
	page.getEmail().sendKeys("ramyaparu1999@gmail.com");
	page.getContinue().click();
	page.getPassWord().sendKeys("8105567249");
    page.getAccountSignin().click();
    Thread.sleep(1000);
   page.getSearchButton().clear();
   Thread.sleep(1000);
   page.getSearchButton().sendKeys("Wings of Fire");
    page.getSearchButton().sendKeys(Keys.ENTER);
  //  page.getSubmit().click();
  page.getSelect().click();
  Set<String> windows=driver.getWindowHandles();
  String handle=null;
  for(String change : windows)
  {
	  handle=change;
  }
  driver.switchTo().window(handle);
  page.getAddToCart().click();
  page.getCart().click();
  page.getProceedToBuy().click();
  Thread.sleep(1000);
  driver.navigate().back();
  page.getHomePage1().click();
  page.getSideTab().click();
  page.getSignOut().click();
 
}
@Test( dataProvider="getdata")
public void searchItem(String input) throws InterruptedException
{
	
	page.getSearchButton().clear();
	page.getSearchButton().sendKeys(input);
	Thread.sleep(2000);
	List<WebElement> search=page.getInputs();
	for(WebElement element:search)	{	
	Reporter.log(element.getText(),true);
	
}
	page.getSearchButton().submit();
	boolean Title=driver.getTitle().contains(input);
	Assert.assertTrue(Title);
}


/*@DataProvider
public Object[][]getData()
{
	Object[][] data=new Object[2][1];
	data[0][0]="Mobile";
	data[1][0]="Shirts";
	return data;
}*/


@DataProvider
public String[][] getdata() throws Exception {
	
	String xlPath="C:\\Users\\USER\\eclipse-workspace\\SeleniumAutomation\\TestData\\TestData.xlsx";
	//String xlPath="C:\\Users\\USER\\eclipse-workspace\\SeleniumAutomation\\src\\test\\java\\AmazonEndTOEnd\\testdata.xlsx";
	String xlSheet="Sheet1";
	int rowCount=excelutil.getRowCount(xlPath,xlSheet);
	int cellCount=excelutil.getCellCount(xlPath,xlSheet,rowCount);
	String[][] data=new String [rowCount][cellCount];
	for(int i=1;i<=rowCount;i++)
	{
		for(int j=0;j<cellCount;j++)
		{
			 data[i-1][j]=excelutil.getCellData(xlPath,xlSheet,i,j);
		}
	}
	return data;
}
	
}

