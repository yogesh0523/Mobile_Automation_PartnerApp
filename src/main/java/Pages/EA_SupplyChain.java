package Pages;

import org.openqa.selenium.By;
import Utils.Upload_file;

public class EA_SupplyChain extends Basepage {

    Upload_file uploadPic;

    // Constructor to initialize Upload_file instance
    public EA_SupplyChain(Upload_file uploadPic) {
        super();
        this.uploadPic = uploadPic;
    }
	
    By Scf = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[10]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView[2]");
    By AddScfEnquiry = By.xpath("//android.view.ViewGroup[@content-desc='Add new enquiry']");
    By ProjCommTillDate = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
    By EmploStrength = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
    By noOfProjComm = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText");
    By state = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText");
    By stateSelect = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]");
    By GST = By.xpath("//android.view.ViewGroup[@content-desc=\"GST fillings for last 2 years, Click To Upload\"]/android.view.ViewGroup");
    By ITR = By.xpath("//android.view.ViewGroup[@content-desc=\"ITR fillings for last 2 years, Click To Upload\"]/android.view.ViewGroup");
    By BankStatement = By.xpath("//android.view.ViewGroup[@content-desc=\"Bank statements for last 2 years, Click To Upload\"]/android.view.ViewGroup");
    By SubmitBtn = By.xpath("//android.view.ViewGroup[@content-desc=\"Submit\"]");	
	
    public void SupplyChainFinanace() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(Scf).click();
    }
	
    public void AddEnquiry() {
        driver.findElement(AddScfEnquiry).click();
    }
	
    public void ProjectCommission() {
        driver.findElement(ProjCommTillDate).sendKeys("100");
    }
	
    public void EmployeeStrength() {
        driver.findElement(EmploStrength).sendKeys("100");
    }

    public void NoOfProject() {
        driver.findElement(noOfProjComm).sendKeys("100");
    }
	
    public void State() {
        driver.findElement(state).sendKeys("Maharashtra");
    }
	
    public void Stateselection() {
        driver.findElement(stateSelect).click();
    }
	
    public void GSTUpload() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(GST).click();
        uploadPic.uploadPicture(); // Use the instance method
    }
	
    public void ITRUpload() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(ITR).click();
        uploadPic.uploadPicture(); // Use the instance method
    }
	
    public void BankStatementUpload() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(BankStatement).click();
        uploadPic.uploadPicture(); // Use the instance method
    }
	
    public void Submit() throws InterruptedException {
    	Thread.sleep(3000);
        driver.findElement(SubmitBtn).click();
    }
}
