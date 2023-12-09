package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnHybridAppInIos extends GenericWrappers {
    @Test
    public void runCode() {
        launchIosApp("iPhone 15", "", "", "com.example.apple-samplecode.UICatalog", "");
        swipe("up");
        click(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Web View"));
        printContext();
        sleep(5000);
        printContext();
        switchWebView();
        click(getWebElement(Locators.XPATH.asString(), "//a[@data-analytics-title=\"Buy iPhone 15\"]"));
        sleep(6000);
        click(getWebElement(Locators.ID.asString(), "globalnav-menutrigger-button"));
        sleep(2000);
        click(getWebElement(Locators.XPATH.asString(), "//a[@aria-label=\"AirPods menu\"]"));
        sleep(5000);
        closeApp();


    }
}