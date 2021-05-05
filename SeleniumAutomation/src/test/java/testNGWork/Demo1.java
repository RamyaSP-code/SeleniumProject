package testNGWork;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Internet Banaking Application
//Login,FundTransfer,Utilitybillpayment,ccbillpayment,Logout
//Login -----> FundTransfer----> Logout
//Login -----> Utilitybillpayment----> Logout
//Login -----> Ccbillpayment----> Logout
//login & logout are test fixtured need to be executed repeatedly
public class Demo1 {
	@Test(priority=1)
public void FundTransfer()
{
	//System.out.println("Transeferring");
		Reporter.log("Transferring", true);
}
	@Test(priority=3)
public void Utilitybillpayment()
{
	//System.out.println("Utility bill payment");
		Reporter.log("utility bill payment", true);

}
	@Test(priority=2)
public void Ccbillpayment()
{
	//System.out.println("Credit card bill payment");
		Reporter.log("credit card bill payment", false);

}
	@BeforeMethod
public void Login()
{
	System.out.println("Login");//
}
	@AfterMethod

public void Logout()
{
	System.out.println("Log out");
}
@BeforeClass
public void InvokeBrowser()
{
	System.out.println("invoke the browser");
}
@AfterClass
public void CloseBrowser()
{
	System.out.println("close the browser");
}

@BeforeTest
public void SetUp()
{
	System.out.println("setup");
}
@AfterTest
public void TearDown()
{
	System.out.println("teardown");
}


}
