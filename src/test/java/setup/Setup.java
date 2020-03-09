package setup;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import java.net.URL;

public class Setup {
    public static DesiredCapabilities capApp;
    public static AndroidDriver driver;
    public static WebDriverWait wait;

    @Before
    public void before() throws MalformedURLException {
        System.out.println("Hello");
        capApp = new DesiredCapabilities();
        capApp.setCapability("platformName", "Android");
        capApp.setCapability("platformVersion", "6.0.1");
        capApp.setCapability("deviceName", "f88703ac");
        capApp.setCapability(MobileCapabilityType.APP,"C:/Users/paulo.corbacho/AppData/Local/Android/Sdk/platform-tools/app.apk");
        capApp.setCapability("appPackage","com.donus.homolog");
        capApp.setCapability("appActivity", "com.donus.MainActivity");
        capApp.setCapability(MobileCapabilityType.NO_RESET, true);
        capApp.setCapability(MobileCapabilityType.FULL_RESET, false);
        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capApp);
    }

    @After
    public void afterClass() {
        driver.quit();
    }
}
