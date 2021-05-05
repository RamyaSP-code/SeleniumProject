package testNGWork;

import org.testng.annotations.Test;

public class Red extends TestBase {
	@Test
	public void Login() {
rf.getSignIn().click();
}
}