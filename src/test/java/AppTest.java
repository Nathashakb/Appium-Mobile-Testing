import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;



public class AppTest {
    public static void main(String[] args) throws MalformedURLException {
        openMobileApp();
    }


    static AppiumDriver driver;
    public static void openMobileApp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "11");
        cap.setCapability("deviceName", "Nokia 1.4");
        cap.setCapability("udId", "A00000K580141301272");
        cap.setCapability("automationName", "uiAutomator2");
        cap.setCapability("appPackage", "com.ubercab.driver");
        cap.setCapability("appActivity", "com.ubercab.carbon.core.CarbonActivity");

        URL url = new URL(" http://127.0.0.1:4723/");
        driver = new AppiumDriver(url,cap);

       // driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId('com.android.permissioncontroller:id/permission_allow_foreground_only_button')")).click();

        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\")")).click();

        System.out.println("Application started");
    }
}
