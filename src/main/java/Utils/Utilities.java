package Utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.Basepage;
import io.appium.java_client.remote.MobileCapabilityType;

public class Utilities extends Basepage{

	  public static DesiredCapabilities setDesiredCapabilities() {
	        DesiredCapabilities dc = new DesiredCapabilities();
	        
	        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
	        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Kavita");
	        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15");
	        dc.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "\\src\\main\\resources\\Demo1.apk");
	        
	        return dc;
	    }
	  
	  public static void explicitlyWait(int seconds,By locator) {
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(seconds));
		  wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	  }
	  
	  
}
