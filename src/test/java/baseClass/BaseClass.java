package baseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static AppiumDriver<MobileElement> driver;

    @BeforeMethod

    @Parameters({"deviceName", "udid", "platformVersion", "url", "automationName", "app"})
    public void setUp(String deviceName, String udid, String platformVersion, String url, String automationName, String app) throws InterruptedException, MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "Android");
        cap.setCapability("appium:platformVersion", platformVersion);
        cap.setCapability("appium:deviceName", deviceName);
        cap.setCapability("appium:automationName", automationName);
        cap.setCapability("appium:app", app);
        cap.setCapability("appium:udid", udid);
        cap.setCapability("appium:ignoreHiddenApiPolicyError", true);
        cap.setCapability("appium:ensureWebviewsHavePages", true);
        cap.setCapability("appium:nativeWebScreenshot", true);
        cap.setCapability("appium:newCommandTimeout", 3600);
        cap.setCapability("appium:connectHardwareKeyboard", true);
        System.out.println("Aplication Startded .....");


        driver = new AppiumDriver<MobileElement>(new URL(url), cap);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(1000);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}