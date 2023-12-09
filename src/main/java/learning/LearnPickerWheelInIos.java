package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnPickerWheelInIos extends GenericWrappers {
    @Test
    public void runCode() {
        launchIosApp("iPhone 15", "", "", "com.example.apple-samplecode.UICatalog", "");
        click(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Picker View"));
        enterValue(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Red color component value"), "200", false);
        enterValue(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Green color component value"), "100", false);
        enterValue(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Blue color component value"), "150", false);
        chooseNextOptionInPickerWheel(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Red color component value"));
        choosePreviousOptionInPickerWheel(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Green color component value"));
        sleep(5000);
        closeApp();

    }


}