package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Basepage;
import Pages.LoginPage;

public class LoginpageTest extends Basepage{
	
	private static final boolean isElementPresent = false;

	public LoginpageTest(){
		super();
	}
	
	LoginPage loginpage;
	
	
	
	@BeforeTest
	public void beforeTest() {
		loginpage = new LoginPage();
		init();
	}
	
	
	@Test(priority = 1)
	public void verifyLoginPage() throws InterruptedException {
		loginpage.getLogin("8765432343");
	}
	
	
}