package PoMApproach;

import org.testng.annotations.Test;

public class LoginPageTest extends DriverClass{

	public static LoginPage logins;

	@Test
	public void UserLogin() {

		DriverClass.getDriver().navigate().to("https://opensource-demo.orangehrmlive.com/");
		logins= new LoginPage(DriverClass.getDriver());
		logins.EnterUserName();
		logins.EnterPassword();
		logins.LoginButton();
		
	}
	
}
