package learning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;

public class LearnSwipeWithinWebElementUsingPointerInput {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("automationName", "UiAutomator2");
        dc.setCapability("platformName", "Android");
        dc.setCapability("deviceName", "my device");
        dc.setCapability("noReset", true);
        dc.setCapability("appPackage", "com.android.vending");
        dc.setCapability("appActivity", "com.android.vending.AssetBrowserActivity");
        AppiumDriver driver = new AppiumDriver(new URL("http://0.0.0.0:4723/"), dc);
        int maxX = driver.manage().window().getSize().getWidth();
        int maxY = driver.manage().window().getSize().getHeight();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Thread.sleep(5000);
        WebElement ele = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Price drops on books\"]/../following-sibling::android.view.View"));
//        int eleStartX= ele.getLocation().getX();
//        int eleStartY = ele.getLocation().getY();
//        int eleWidth = ele.getSize().getWidth();
//        int eleHeight = ele.getSize().getHeight();
        int eleStartX = ele.getRect().getX();
        int eleStartY = ele.getRect().getY();
        int eleWidth = ele.getRect().getWidth();
        int eleHeight = ele.getRect().getHeight();
        int startX = 0, startY = 0, endX = 0, endY = 0;
        //Swipe left
        startX = (int) (eleStartX + (eleWidth * 0.8));
        startY = (int) (eleStartY + (eleHeight * 0.5));
        endX = (int) (eleStartX + (eleWidth * 0.2));
        endY = (int) (eleStartY + (eleHeight * 0.5));
        PointerInput input = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipeleftWithinEle = new Sequence(input, 1);
        swipeleftWithinEle.addAction(input.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        swipeleftWithinEle.addAction(input.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipeleftWithinEle.addAction(input.createPointerMove(Duration.ofMillis(2000), PointerInput.Origin.viewport(), endX, endY));
        swipeleftWithinEle.addAction(input.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(swipeleftWithinEle));
        driver.quit();
    }
}