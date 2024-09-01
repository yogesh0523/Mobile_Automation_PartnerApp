package Pages;

import java.awt.Window;

import org.apache.commons.lang3.RandomUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import Utils.Upload_file;
import Utils.Utilities;

public class Profile_Bank_Details extends Basepage{
	Upload_file uploadPic;
	
	public Profile_Bank_Details() {
		super();
		this.uploadPic = uploadPic;
	}
	
	By Profile = By.xpath("//android.view.ViewGroup[@content-desc=\"Hello!, NamexEbKv \"]/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView[2]");
	By BankDetails = By.xpath("//android.widget.TextView[@text='Bank details']");
	By AddBankAccount = By.xpath("//android.widget.TextView[@text='Add bank account']");
	By AccountHolderName = By.xpath("//android.widget.EditText[@text='Enter account holder name']");
	By BankName = By.xpath("//android.widget.EditText[@text='Enter bank name']");
	By AccountNumber = By.xpath("//android.widget.EditText[@text='Enter account number']");
	By AccountType = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup");
	By SelectTypeAcc = By.id("//android.widget.TextView[@text='Current']");
	By IFSC = By.xpath("//android.widget.EditText[@text='Enter IFSC code']");
	By UploadCancelChecque = By.xpath("//android.widget.TextView[@text='Click To Upload']");
	By Submit = By.xpath("//android.widget.TextView[@text='Submit']");
	
	public void ProfileBtn() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(Profile).click();
	}
	
	public void BankDetailsBtn() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(BankDetails).click();
	}
	
	public void AddBankAccountBtn() throws InterruptedException {
		driver.findElement(AddBankAccount).click();
	}
	
	public void Accountholdername() throws InterruptedException {
		driver.findElement(AccountHolderName).sendKeys("TestAccountHolder");;
	}
	
	public void Bankname() throws InterruptedException {
		driver.findElement(BankName).sendKeys("HDFC");;
	}
	
	public void Accountnumber() throws InterruptedException {
		driver.findElement(AccountNumber).sendKeys("15881000000000");
	}
	
	public void Accounttype() throws InterruptedException {
		driver.findElement(AccountType).click();
	}
	
	public void Accounttypeselect() throws InterruptedException {
		driver.findElement(SelectTypeAcc).click();
	}
	
	public void Ifsc() throws InterruptedException {
		driver.findElement(IFSC).sendKeys("HDFC0001588");
	}
	
	public void UploadCheque() throws InterruptedException {
		driver.findElement(UploadCancelChecque).click();
		uploadPic.uploadPicture();
	}
	
	public void submitButton() throws InterruptedException {
		driver.findElement(Submit).click();
	}
	

}
