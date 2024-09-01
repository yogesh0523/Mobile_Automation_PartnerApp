package Pages;

import java.awt.Window;

import org.apache.commons.lang3.RandomUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import Utils.Utilities;

public class EA_CustomerLoan extends Basepage{
	
	public EA_CustomerLoan() {
		super();
	}
	
	
	
	
	
	
	By CustomerLoanBtn = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView[2]");
	By addLoanEnquiryBtn = By.xpath("//android.view.ViewGroup[@content-desc='Add new enquiry']");
	By CustType = By.xpath("//android.widget.EditText[@text='Residential']");
	By CustTypeCom = By.xpath("//android.widget.TextView[@text=\"Commercial & Industrial\"]");
	By CustName = By.xpath("//android.widget.EditText[@text='Enter Customer name']");
	By CompName = By.xpath("//android.widget.EditText[@text='Enter Company name']");
	By InstallLocation = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView");
	By LocationPerm = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
	By CustMobile = By.xpath("//android.widget.EditText[@text='Enter Customer mobile number']");
	By ProjSize = By.xpath("//android.widget.EditText[@text='Enter Project size']");
	By ProjCost = By.xpath("//android.widget.EditText[@text='Enter Project cost']");
	By ElectricBill = By.xpath("//android.widget.EditText[@text=\"Enter Average monthly bill\"]");
	By Submit = By.xpath("//android.view.ViewGroup[@content-desc='Submit']");
	
	public void CustomerLoan() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(CustomerLoanBtn).click();
	}
	
	public void LoanEnquiry() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(addLoanEnquiryBtn).click();	
	}
	
	public void CustmerType() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(CustType).click();	
	}
	
	public void CustmerTypeCommertial() throws InterruptedException {
		driver.findElement(CustTypeCom).click();	
	}
	
	public void CustmerName() throws InterruptedException {
		driver.findElement(CustName).sendKeys("Lalit");;	
	}
	
	public void CompanyName() throws InterruptedException {
		driver.findElement(CompName).sendKeys("BMW");;	
	}
	
	public void InstallationLoc() throws InterruptedException {
		driver.findElement(InstallLocation).click();
		Thread.sleep(5000);
	}
	
	public void Locationpermission() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(LocationPerm).click();
	}
	
	public void CustomerMobile() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(CustMobile).sendKeys("9876778976");	
	}
	
	public void ProjectSize() throws InterruptedException {
		driver.findElement(ProjSize).sendKeys("100");	
	}
	
	public void ProjectCost() throws InterruptedException {
		driver.findElement(ProjCost).sendKeys("1500000");	
	}
	
	public void BillElectric() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(ElectricBill).sendKeys("1500");	
	}
	
	public void Submitbutn() throws InterruptedException {
		driver.findElement(Submit).click();	
	}


}
