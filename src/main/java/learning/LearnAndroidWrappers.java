package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnAndroidWrappers extends GenericWrappers {
    @Test
    public void runCode() {
        launchAndroidApp("df", "", "", "UiAutomator2", "/apks/leaforg.apk");
        sleep(5000);
        showNotificationMenu();
        sleep(2000);
        hideNotificationMenu();
        dataOffInAndroid();
        sleep(5000);
        dataOnInAndroid();
        System.out.println(getCurrentAppPackage());
        System.out.println(getCurrentActivity());
        sleep(3000);
        closeApp();
    }
}