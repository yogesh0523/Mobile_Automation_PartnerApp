package Utils;

import org.openqa.selenium.By;
import io.appium.java_client.android.AndroidDriver;

public class Upload_file {
    private AndroidDriver driver;

    // Constructor to initialize the driver
    public Upload_file(AndroidDriver driver) {
        this.driver = driver;
    }

    public By DownloadFolder = By.xpath("//android.widget.ImageButton[@content-desc=\"Show roots\"]");
    public By ClickDownload = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Downloads\"]");
    public By SelectPic = By.xpath("(//android.widget.ImageView[@resource-id=\"com.google.android.documentsui:id/icon_thumb\"])[1]");

    public void uploadPicture() throws InterruptedException {
        driver.findElement(DownloadFolder).click();
        Thread.sleep(5000);
        driver.findElement(ClickDownload).click();
        Thread.sleep(5000);
        driver.findElement(SelectPic).click();
    }
}
