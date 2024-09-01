package Pages;

import org.openqa.selenium.By;

import Utils.Upload_file;

public class EA_Design_Support extends Basepage{
	
	String randomMobileNumber;
	Upload_file uploadPic;
	
	
	public EA_Design_Support(Upload_file uploadPicture) 
	{
		super();
		this.uploadPic = uploadPicture;
	}
	
	By DesignSupport = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView[2]");
    By AddReqBtn = By.xpath("//android.view.ViewGroup[@content-desc='Add request']");
    By RequestType = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup");
    By RequestTypeSelect = By.xpath("//android.widget.TextView[@text='Layout Preparation']");
    By ProjName = By.xpath("//android.widget.EditText[@text='Enter project name']");
    By ProjLoc = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/com.horcrux.svg.SvgView");
    By LocSelect = By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]");
    By ModuleSpecRating = By.xpath("//android.widget.EditText[@text='Enter PV Module Specifications (Rating)']");
    By ModuleSpecMake = By.xpath("//android.widget.EditText[@text='Enter PV Module Specifications (Make)']");
    By AC = By.xpath("//android.widget.EditText[@text='Enter Project capacity (AC)']");
    By DC = By.xpath("//android.widget.EditText[@text='Enter Project capacity (DC)']");
    By InvertRating = By.xpath("//android.widget.EditText[@text='Enter Inverter specifications (Rating)']");
	By InvertMake = By.xpath("//android.widget.EditText[@text='Inverter brand']");
	By RoofType = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup");
	By RoofTypeSelect = By.xpath("//android.widget.TextView[@text='Flat RCC']");
    By UploadSitePic = By.xpath("//android.view.ViewGroup[@content-desc=\"Upload Site Pictures, Click To Upload\"]/android.view.ViewGroup");
    By Submit = By.xpath("//android.view.ViewGroup[@content-desc='Submit']");
	
    
    
    public void DesignSupportBtn() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(DesignSupport).click();
    }
	
    public void AddReqButton() {
        driver.findElement(AddReqBtn).click();
    }
	
    public void RequestTypeBtn() {
        driver.findElement(RequestType).click();
    }
	
    public void RequestTypeSelection() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(RequestTypeSelect).click();
    }
	
    public void ProjectName() {
        driver.findElement(ProjName).sendKeys("TestProject");
    }
	
    public void ProjLocation() {
        driver.findElement(ProjLoc).click();
    }
    
    public void LocationSelection() {
        driver.findElement(LocSelect).click();
    }
	
    public void ModuleSpecificationRating() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(ModuleSpecRating).sendKeys("test123");
    }
	
    public void ModuleSpecificationMake() {
        driver.findElement(ModuleSpecMake).sendKeys("test12321");
    }
	
    public void Ac() {
        driver.findElement(AC).sendKeys("50");
    }
    
    public void Dc() {
        driver.findElement(DC).sendKeys("50");
    }
    
    public void InverterRating() {
        driver.findElement(InvertRating).sendKeys("100");
    }
     
    public void InverterMake() {
        driver.findElement(InvertMake).sendKeys("TestMaker");
    }
    
    public void Rooftype() {
        driver.findElement(RoofType).click();
    }
    
    public void RoofTypeSelection() {
        driver.findElement(RoofTypeSelect).click();
    }
    
    public void UploadSitePicture() {
        driver.findElement(UploadSitePic).click();
    }
     
    public void submit() {
        driver.findElement(Submit).click();
    }
    
    
    
    
    
    
    
    
    
    

}
