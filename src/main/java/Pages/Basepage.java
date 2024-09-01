package Pages;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import Utils.Utilities;
import io.appium.java_client.android.AndroidDriver;

public class Basepage {
	
	public static Properties prop;
	public static AndroidDriver driver;
	
	public Basepage() {
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//main//resources//config.properties");
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File not found...!!");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Unable to load propertis file...!!");
		}
	}
	
	
	public void init() {
		String driverName = prop.getProperty("driver");
		if(driverName.equalsIgnoreCase("Android")) {
			 try {
				driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), Utilities.setDesiredCapabilities());
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(prop.getProperty("wait"))));
			} catch (MalformedURLException e) {
				e.printStackTrace();
				System.out.println("Url was wrong...!!");
			}
		}
	}
}
