package Test;

import org.apache.commons.lang3.RandomUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Basepage;
import Pages.EA_SupplyChain;
import Pages.LoginPage;
import Utils.Upload_file;
import io.appium.java_client.android.AndroidDriver;

public class SCF_Test extends Basepage {

    public String randomMobileNumber = "98765" + (100000 + new RandomUtils().nextInt());
    LoginPage loginpage;
    EA_SupplyChain loan;
    Upload_file uploadFile;

    public SCF_Test() {
        super();
    }

    @BeforeTest
    public void beforeTest() {
        init(); // Initialize the driver using the init() method from Basepage
        uploadFile = new Upload_file(driver); // Use the 'driver' directly as it's inherited from Basepage
        loan = new EA_SupplyChain(uploadFile); // Pass Upload_file instance to EA_SupplyChain
        loginpage = new LoginPage();
    }

    @Test()
    public void Verify_EA_SCF() throws InterruptedException {
        loginpage.getLogin(randomMobileNumber);
        loan.SupplyChainFinanace();
        loan.AddEnquiry();
        loan.ProjectCommission();
        loan.EmployeeStrength();
        loan.NoOfProject();
        loan.State();
        loan.Stateselection();
        
        loan.GSTUpload();
        loan.ITRUpload();
        loan.BankStatementUpload();
        
        loan.Submit();
    }
}
