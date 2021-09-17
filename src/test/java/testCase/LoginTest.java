package testCase;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	@Test(priority = 1)
	public void login()
	{
		lp.loginToApp();
		lp.enterPin();
		

	}

//	@Test(priority = 2, enabled = false)
//	public void logout() throws InterruptedException
//	{
//
//		lp.logout();
//
//	}


}
	


