package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnScrollUsingWrappers extends GenericWrappers {
    @Test
    public void runCode() {
        launchApp("Android", "my device", "", "", "", "UiAutomator2", "", "", "", "", "", "/apks/MultiTouch Tester_v1.2.apk", "", "");
        swipe("up");
        swipe("down");
        swipe("left");
        swipe("right");
        pinchInApp();
        zoomInApp();
        doubleTap(300, 300);
        longPress(400, 400);
        sleep(1000);
        stopRunningApp("com.the511plus.MultiTouchTester");
        closeApp();
    }
}