package Test;

import org.apache.commons.lang3.RandomUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Basepage;
import Pages.EA_Aeroc;
import Pages.LoginPage;

public class Aeroc_Test extends Basepage {
	
	public String randomMobileNumber = "98765" + (100000 + new RandomUtils().nextInt());
	LoginPage loginpage;
	EA_Aeroc loan;
	
	public Aeroc_Test(){
		super();
	}
	
	@BeforeTest
	public void beforeTest() {
		loginpage = new LoginPage();
		loan = new EA_Aeroc();
		init();
		
	}
	
	
	@Test()
	public void VerifyEA_CustomerLoan() throws InterruptedException {
		loginpage.getLogin(randomMobileNumber);
		loan.AerocMonitoring();
		loan.AddPlant();
		loan.CustmerTypeAeroc();
		loan.CustmerTypeCommertial();
		loan.PlantType();
		loan.PlantGroundMount();
		loan.InstallationLoc();
		loan.Locationpermission();
		loan.InstallationLoc();
		loan.PlantName();
		loan.CapacityAc();
		loan.CapacityDC();
		loan.Tariff();
		loan.Continue();
		loan.AddInveter();
		loan.Edit();
		loan.MakeDropdown();
		loan.MakeSelection();
		loan.ModelDropdown();
		loan.ModelSelection();
		loan.DataLoggerDropdown();
		loan.DataLoggerSelection();
		loan.DataLoggerSerialNumber();
		loan.InverterSerialNumber();
		loan.AcCapacityInverter();
		loan.DcCapacityInverter();
		loan.InverterContinueButton();
		loan.InverterContinueButton();
		loan.January();
		loan.Februwary();
		loan.March();
		loan.April();
		loan.MayMonth();
		loan.June();
		loan.July();
		loan.August();
		loan.September();
		loan.Octomber();
		loan.November();
		loan.Descember();
		loan.InverterContinueButton();
		
		
	}
}
