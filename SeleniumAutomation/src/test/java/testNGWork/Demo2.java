package testNGWork;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//6 methods one is disabled and other is executed 3 times
public class Demo2 {



	@Test(priority=1,groups="payments")
	public void FundTransfer()
	{
		//System.out.println("Transeferring");
			Reporter.log("Transferring", true);
	}
	@Test(priority=3,groups="payments",enabled=false)//this method is physically present but never be executed
	public void Utilitybillpayment()
	{
		//System.out.println("Utility bill payment");
			Reporter.log("utility bill payment", true);
	}
	@Test(priority=2,groups="payments",invocationCount=3)//without using for loop it will execute 3 times
	public void Ccbillpayment()
	{
		//System.out.println("Credit card bill payment");
			Reporter.log("credit card bill payment", false);
	}
	@BeforeClass
	public void Login()
	{
		System.out.println("Login");//
	}
	@AfterClass
	public void Logout()
	{
		System.out.println("Log out");
	}
	@BeforeTest
	public void InvokeBrowser()
	{
		System.out.println("invoke the browser");
	}
	@AfterTest
	public void CloseBrowser()
	{
		System.out.println("close the browser");
	}
	@BeforeMethod
	public void CheckBalance()
	{
		System.out.println("check balnce");
	}
	@AfterMethod
	public void Acknowledgment()
	{
		System.out.println("Acknowledgement");
	}
	@Test(priority=4,groups="insurance")
	public void BikeInsurance()
	{
		//System.out.println(" BIKE Insurance");
		Reporter.log(" BIKE Insurance",true);

	}
	
@Test(priority=5,groups="insurance")
	public void CarInsurance()
	{
		//System.out.println(" CAR Insurance");
	Reporter.log(" CAR Insurance",true);

	}
	
}
