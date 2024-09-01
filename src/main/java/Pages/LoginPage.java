package Pages;



import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.openqa.selenium.By;

import Utils.Utilities;

public class LoginPage extends Basepage{
	
	public LoginPage() {
		super();
	}
	
	By getStartedBtn = By.xpath("//android.view.ViewGroup[@content-desc='Get started']");
	By mobileNumber = By.xpath("//android.widget.EditText[@text='Enter your mobile number']");
	By verifyBtn = By.xpath("//android.view.ViewGroup[@content-desc='Verify']");
	By skipBtn = By.xpath("//android.view.ViewGroup[@content-desc=\"Skip\"]");
	By CopyText = By.xpath("//android.widget.TextView[@index='3']");
	By PasteOtp = By.xpath("//android.widget.EditText[@text='Please enter a 6 digit OTP.']");
	String a;
	By verifyOtp = By.xpath("//android.widget.TextView[@text='Verify']");
	
	boolean isElementPresent;
	By NameEntity = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.EditText");	
	By ContactPerName = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.EditText");
	By Email = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.EditText");
	By LetsgetStarted = By.xpath("//android.widget.TextView[@text=\"Let's get started\"]");
	
	
	public void clickOnSkipBtn() {
		Utilities.explicitlyWait(7000,skipBtn);
		driver.findElement(skipBtn).click();
	}
	
	public void clickOnGetStarted() throws InterruptedException {
		Utilities.explicitlyWait(15,getStartedBtn);
		driver.findElement(getStartedBtn).click();
	}
	
	public void enterMobileNumber(String mobNo) {
		driver.findElement(mobileNumber).sendKeys(mobNo);
	}
	
	public void clickOnVerifyBtn() throws InterruptedException {
		driver.findElement(verifyBtn).click();
		Thread.sleep(5000);
	}
		
	public void CopyOTP() throws InterruptedException {
			a=driver.findElement(CopyText).getText();		
		
	}
	public void SendOTP() throws InterruptedException {
		driver.findElement(PasteOtp).sendKeys(a);		
    }
	
	public void VerifyOTPBtn() throws InterruptedException {
		driver.findElement(verifyOtp).click();
    }
	
	public void EntityName() throws InterruptedException {
		isElementPresent = driver.findElements(NameEntity).size() > 0;
		driver.findElement(NameEntity).sendKeys("LogiNext");
		
    }
	
	public void ContactPersonName() throws InterruptedException {
		driver.findElement(ContactPerName).sendKeys("Name" + RandomStringUtils.randomAlphabetic(5));
	}	
		
	public void EmailAddress() throws InterruptedException {
		driver.findElement(Email).sendKeys("boss+" + new RandomUtils().nextInt() + "@gmail.com");	
    }
	
	public void LetsStart() throws InterruptedException {
		driver.findElement(LetsgetStarted).click();
    }
	
	public void getLogin(String number) throws InterruptedException {
		clickOnSkipBtn();
		clickOnGetStarted();
		enterMobileNumber(number);
		clickOnVerifyBtn();
		CopyOTP();
		SendOTP();
		VerifyOTPBtn();
		EntityName();
		ContactPersonName();
		EmailAddress();
		LetsStart();
		
	}
}