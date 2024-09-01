package Test;

import org.apache.commons.lang3.RandomUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Basepage;
import Pages.LoginPage;
import Pages.Profile_Bank_Details;

public class BankDetails_Test extends Basepage {
	
	public String randomMobileNumber = "98765" + (100000 + new RandomUtils().nextInt());
	LoginPage loginpage;
	Profile_Bank_Details loan;
	
	public BankDetails_Test(){
		super();
	}
	
	@BeforeTest
	public void beforeTest() {
		loginpage = new LoginPage();
		loan = new Profile_Bank_Details();
		init();
		
	}
	
	
	@Test()
	public void Profile_Bank_Details() throws InterruptedException {
		loginpage.getLogin(randomMobileNumber);
		loan.ProfileBtn();
		loan.BankDetailsBtn();
		loan.AddBankAccountBtn();
		loan.Accountholdername();
		loan.Bankname();
		loan.BankDetailsBtn();
		loan.Accountnumber();
		loan.Accounttype();
		loan.Accounttypeselect();
		loan.Ifsc();
		loan.UploadCheque();
		loan.submitButton();
		
	}
}
