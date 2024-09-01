package Pages;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import Utils.Utilities;

public class EA_Aeroc extends Basepage{
	
	String randomMobileNumber;
	
	public EA_Aeroc() {
		super();
	}
	
	By AerocMonBtn = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView[2]");
	By addSolarPlant = By.xpath("//android.view.ViewGroup[@content-desc='Add Solar Plant']");
	By CustTypeAeroc = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup");
	By CustTypeCom = By.xpath("//android.widget.TextView[@text='Commercial']");
	By PlantTyp = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup");
	By PlantGroundMount = By.xpath("//android.widget.TextView[@text='Ground Mount']");
	By InstallLocation = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/com.horcrux.svg.SvgView");
	By LocationPerm = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
	By Plant = By.xpath("//android.widget.EditText[@text=\"Enter Plant name\"]");
	By ACcapacity = By.xpath("//android.widget.EditText[@text='Enter AC capacity']");
	By DCcapacity = By.xpath("//android.widget.EditText[@text=\"Enter DC capacity\"]");
	By TariffValue =By.xpath("//android.widget.EditText[@text='Enter Tariff (Rs/kWh)']");
	By ContinueBtn = By.xpath("//android.view.ViewGroup[@content-desc='Continue']");
	By AddInverterBtn = By.xpath("//android.view.ViewGroup[@content-desc='Add Inverter']");
	By EditBtn = By.xpath("//android.widget.TextView[@text='Edit']");
	By Makedrop =By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup");
	By MakeSelect = By.xpath("//android.view.ViewGroup[@content-desc='HAVELLS']");
	By Modeldrop = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup");
	By ModelSelect = By.xpath("//android.view.ViewGroup[@content-desc='ENVIRO GTI KT']");
	By DataLoggerDrp = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup");
	By DataLoggerselect = By.xpath("//android.view.ViewGroup[@content-desc='SOLARMAN']");
	By DataLoggerSerialNum = By.xpath("//android.widget.EditText[@text='Enter Data logger serial number']");
	By InvertorSerialNum = By.xpath("//android.widget.EditText[@text=\"Enter Inverter serial number\"]");
	By AcCap = By.xpath("//android.widget.EditText[@text='Enter AC capacity']");
	By DcCap = By.xpath("//android.widget.EditText[@text='Enter DC capacity']");
	By InverterContinueBtn = By.xpath("//android.view.ViewGroup[@content-desc='Continue']");
	By Jan = By.xpath("//android.widget.EditText[@text='Enter generation for January']");
	By Feb = By.xpath("//android.widget.EditText[@text='Enter generation for February']");
	By Mar = By.xpath("//android.widget.EditText[@text='Enter generation for March']");
	By Apr = By.xpath("//android.widget.EditText[@text='Enter generation for April']");
	By May = By.xpath("//android.widget.EditText[@text='Enter generation for May']");
	By Jun = By.xpath("//android.widget.EditText[@text='Enter generation for June']");
	By Jul = By.xpath("//android.widget.EditText[@text='Enter generation for July']");
	By Aug = By.xpath("//android.widget.EditText[@text='Enter generation for August']");
	By Sept = By.xpath("//android.widget.EditText[@text='Enter generation for September']");
	By Oct = By.xpath("//android.widget.EditText[@text='Enter generation for October']");
	By Nov = By.xpath("//android.widget.EditText[@text='Enter generation for November']");
	By Desc = By.xpath("//android.widget.EditText[@text='Enter generation for December']");
	
	
	public void AerocMonitoring() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(AerocMonBtn).click();
	}
	
	public void AddPlant() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(addSolarPlant).click();	
	}
	
	public void CustmerTypeAeroc() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(CustTypeAeroc).click();	
	}
	
	public void CustmerTypeCommertial() throws InterruptedException {
		driver.findElement(CustTypeCom).click();	
	}
	
	public void PlantType() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(PlantTyp).click();
	}
	
	public void PlantGroundMount() throws InterruptedException {
		driver.findElement(PlantGroundMount).click();
	}
	
	public void InstallationLoc() throws InterruptedException {
		driver.findElement(InstallLocation).click();
		Thread.sleep(5000);
	}
	
	public void Locationpermission() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(LocationPerm).click();
	}
	
	public void PlantName() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(Plant).sendKeys("Darshan");	
	}
	
	public void CapacityAc() throws InterruptedException {
		driver.findElement(ACcapacity).sendKeys("10");	
	}
	
	public void CapacityDC() throws InterruptedException {
		driver.findElement(DCcapacity).sendKeys("10");	
	}
	
	public void Tariff() throws InterruptedException {
		driver.findElement(TariffValue).sendKeys("10");	
	}
	
	public void Continue() throws InterruptedException {
		driver.findElement(ContinueBtn).click();	
	}
	
	public void AddInveter() throws InterruptedException {
		driver.findElement(AddInverterBtn).click();	
	}
	
	public void Edit() throws InterruptedException {
		driver.findElement(EditBtn).click();	
	}
	
	public void MakeDropdown() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(Makedrop).click();	
	}
	
	public void MakeSelection() throws InterruptedException {
		driver.findElement(MakeSelect).click();	
	}
	
	public void ModelDropdown() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(Modeldrop).click();	
	}
	
	public void ModelSelection() throws InterruptedException {
		driver.findElement(ModelSelect).click();	
	}
	
	public void DataLoggerDropdown() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(DataLoggerDrp).click();	
	}
	
	public void DataLoggerSelection() throws InterruptedException {
		driver.findElement(DataLoggerselect).click();	
	}
	
	public void DataLoggerSerialNumber() throws InterruptedException {
		driver.findElement(DataLoggerSerialNum).sendKeys("DataSerialNum");
	}
	
	public void InverterSerialNumber() throws InterruptedException {
		driver.findElement(InvertorSerialNum).sendKeys("InverterSerialNum");	
	}
	
	public void AcCapacityInverter() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(AcCap).sendKeys("56");
	}
	
	public void DcCapacityInverter() throws InterruptedException {
		driver.findElement(DcCap).sendKeys("65");
	}
	
	public void InverterContinueButton() throws InterruptedException {
		driver.findElement(InverterContinueBtn).click();
		Thread.sleep(3000);
	}
	
	public void January() throws InterruptedException {
		driver.findElement(Jan).sendKeys("100");	
	}
	
	public void Februwary() throws InterruptedException {
		driver.findElement(Feb).sendKeys("100");
	}
	
	public void March() throws InterruptedException {
		driver.findElement(Mar).sendKeys("100");	
	}
	
	public void April() throws InterruptedException {
		driver.findElement(Apr).sendKeys("100");	
	}
	
	public void MayMonth() throws InterruptedException {
		driver.findElement(May).sendKeys("100");
	}
	
	public void June() throws InterruptedException {
		driver.findElement(Jun).sendKeys("100");
	}
	public void July() throws InterruptedException {
		driver.findElement(Jul).sendKeys("100");
//		 scrollToElement("TEXT_TO_SCROLL_TO"); 
	}
	
//	public void scrollToElement(String textToScrollTo) {
//        driver.findElementByAndroidUIAutomator(
//            "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"" + textToScrollTo + "\"));");
//    } 
	
	
	public void August() throws InterruptedException {
		driver.findElement(Aug).sendKeys("100");	
	}
	
	public void September() throws InterruptedException {
		driver.findElement(Sept).sendKeys("100");
	}
	
	public void Octomber() throws InterruptedException {
		driver.findElement(Oct).sendKeys("100");	
	}

	public void November() throws InterruptedException {
		driver.findElement(Nov).sendKeys("100");	
	}
	
	public void Descember() throws InterruptedException {
		driver.findElement(Desc).sendKeys("100");	
		Thread.sleep(2000);
	}

	
	
	
	
	
	
	


}
