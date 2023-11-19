package learning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AndroidFirstCode {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName","Android");
        dc.setCapability("appium:deviceName","dg");
        dc.setCapability("appium:automationName","UiAutomator2");
        dc.setCapability("appium:app",System.getProperty("user.dir")+"/apks/leaforg.apk");
        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723"),dc);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("rajkumar@testleaf.com");
        driver.findElement(AppiumBy.xpath("(//android.widget.EditText)[2]")).sendKeys("Leaf@123");
        driver.findElement(AppiumBy.className("android.widget.Button")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
