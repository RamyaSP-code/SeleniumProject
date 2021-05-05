package PROJECTCaseStudy;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amazon_TC_001 extends testbAse{

/*@Test(priority=1)
public void Amazon()
{
	
	page.getSignin().click();
	page.getCreateAccount().click();
	page.getFullname().sendKeys("Ramya");
	page.getEmail().sendKeys("ramya@11gmail.com");
	page.getPassword().sendKeys("ramyas123");
	page.getReEnterPassword().sendKeys("ramyas123");
	page.getAccountCreate().click();
	//page.getSearch().click();
	
}
@Test(priority=2)
public  void checknoofElements()
{
	//page.getCreateAccount().click();
	List<WebElement>getAllInputFeilds=page.getAllInputFeilds();
	int size=getAllInputFeilds.size();
	System.out.println(size);
	Assert.assertTrue(size<50);
	for(WebElement element:getAllInputFeilds)
	{
		String Attribute=element.getAttribute("type");
		Reporter.log(Attribute,true);
	}
}

@Test( dataProvider="getdata")
public void searchItem(String input) throws InterruptedException
{
	Thread.sleep(2000);
	page.getSearch().clear();
	page.getSearch().sendKeys(input);
	List<WebElement> search=page.getInputs();
	for(WebElement element:search)	{	
	Reporter.log(element.getText(),true);
	
}
	page.getSerchButton().submit();
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


/*@DataProvider
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
}*/
}
