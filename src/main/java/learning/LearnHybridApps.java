package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnHybridApps extends GenericWrappers {
    @Test
    public void runCode() {
        launchAndroidApp("df", "", "", "UiAutomator2", "/apks/leaforg.apk");
        printContext();
        //switchWebView();
        switchContext("WEBVIEW_com.testleaf.leaforg");
        enterValue(getWebElement(Locators.XPATH.asString(), "//input[@formcontrolname=\"email\"]"), "rajkumar@testleaf.com");
        enterValue(getWebElement(Locators.XPATH.asString(), "//input[@formcontrolname=\"password\"]"), "Leaf@123");
        click(getWebElement(Locators.XPATH.asString(), "//span[text()='Login']/.."));
        sleep(5000);
        switchNativeView();
        closeApp();


    }
}