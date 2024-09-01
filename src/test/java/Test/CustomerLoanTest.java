package Test;

import org.apache.commons.lang3.RandomUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Basepage;
import Pages.EA_CustomerLoan;
import Pages.LoginPage;

public class CustomerLoanTest extends Basepage {
	
	public String randomMobileNumber = "98765" + (100000 + new RandomUtils().nextInt());
	
	public CustomerLoanTest(){
		super();
	}
	LoginPage loginpage;
	EA_CustomerLoan loan;
	
	
	@BeforeTest
	public void beforeTest() {
		loginpage = new LoginPage();
		loan = new EA_CustomerLoan();
		init();
		
	}
	
	
	@Test()
	public void VerifyEA_CustomerLoan() throws InterruptedException {
		loginpage.getLogin(randomMobileNumber);
		loan.CustomerLoan();
		loan.LoanEnquiry();
		loan.CustmerType();
		loan.CustmerTypeCommertial();
		loan.CustmerName();
		loan.CompanyName();
		loan.InstallationLoc();
		loan.Locationpermission();
		loan.InstallationLoc();
		loan.CustomerMobile();
		loan.ProjectSize();
		loan.ProjectCost();
		loan.BillElectric();
		loan.Submitbutn();
		
		
	}
}
