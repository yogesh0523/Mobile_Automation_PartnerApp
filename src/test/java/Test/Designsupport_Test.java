package Test;

import org.apache.commons.lang3.RandomUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Basepage;
import Pages.EA_Design_Support;
import Pages.LoginPage;
import Utils.Upload_file;

public class Designsupport_Test extends Basepage { 

	    public String randomMobileNumber = "98765" + (100000 + new RandomUtils().nextInt());
	    LoginPage loginpage;
	    EA_Design_Support loan;
	    Upload_file uploadFile;

	    public Designsupport_Test() {
	        super();
	    }

	    @BeforeTest
	    public void beforeTest() {
	        init(); // Initialize the driver using the init() method from Basepage
	        uploadFile = new Upload_file(driver); // Use the 'driver' directly as it's inherited from Basepage
	        loan = new EA_Design_Support(uploadFile); // Pass Upload_file instance to EA_SupplyChain
	        loginpage = new LoginPage();
	    }

	    @Test()
	    public void Verify_EA_DesignSupport() throws InterruptedException {
	       loginpage.getLogin(randomMobileNumber);
	       loan.DesignSupportBtn();
	       loan.AddReqButton();
	       loan.RequestTypeBtn();
	       loan.RequestTypeSelection();
	       loan.ProjectName();
	       loan.ProjLocation();
	       loan.LocationSelection();
	       loan.ProjLocation();
	       loan.ModuleSpecificationRating();
	       loan.ModuleSpecificationMake();
	       loan.Ac();
	       loan.Dc();
	       loan.InverterRating();
	       loan.InverterMake();
	       loan.Rooftype();
	       loan.RoofTypeSelection();
	       loan.UploadSitePicture();
	       loan.submit();
	    
	       
	    }

}
