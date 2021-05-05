package AmazonEndTOEnd;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amazonpage1 extends TestBaseProgram {
	@Test( dataProvider="getdata")
	public void searchItem(String input) throws InterruptedException
	{
		Thread.sleep(2000);
		page.getSearch().sendKeys(input);
	page.getSearch().sendKeys(Keys.ENTER);
	page.getSelect().click();
	Set<String> windows=driver.getWindowHandles();
	  String handle=null;
	  for(String change : windows)
	  {
		  handle=change;
	  }
	  driver.switchTo().window(handle);
	page.getCartAdd().click();
	page.getHome().click();
		
	}
	@DataProvider
	public String[][] getdata() throws Exception {
		
		String xlPath="C:\\Users\\USER\\eclipse-workspace\\SeleniumAutomation\\TestData\\TestData.xlsx";
		//String xlPath="C:\\Users\\USER\\eclipse-workspace\\SeleniumAutomation\\src\\test\\java\\AmazonEndTOEnd\\testdata.xlsx";
		String xlSheet="Sheet1";
		int rowCount=ExcelUtility.getRowCount(xlPath,xlSheet);
		int cellCount=ExcelUtility.getCellCount(xlPath,xlSheet,rowCount);
		String[][] data=new String [rowCount][cellCount];
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=0;j<cellCount;j++)
			{
				 data[i-1][j]=ExcelUtility.getCellData(xlPath,xlSheet,i,j);
			}
		}
		return data;
	}
/*	@Test
	  public void amazonShop() throws InterruptedException
	  {
		  page.getSignin().click();
		  page.getEmail().sendKeys("ramyaparu1999@gmail.com");
		  page.getContinue().click();
		  page.getPassword().sendKeys("8105567249");
		  page.getSubmit().click();
		  page.getSearch().sendKeys("ikea tables");
		  page.getSearch().sendKeys(Keys.ENTER);
		 
	      page.getSelect().click();
	      
	      Set<String> window=driver.getWindowHandles();
	      String handle=null;
	      for(String shift : window)
	      {
	    	  handle=shift;
	      }
	      driver.switchTo().window(handle);
	      
		  page.getCartAdd().click();
		  page.getCart().click();
		  page.getBuy().click();
		  driver.navigate().back();
		  page.getHome().click();
		  page.getSideTab().click();
		  page.getSignOut().click();
		
}*/
}