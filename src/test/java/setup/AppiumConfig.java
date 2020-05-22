package setup;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import util.Utils;

@SuppressWarnings("rawtypes")
public class AppiumConfig {

    public static AndroidDriver androidDriver;
    public static IOSDriver iosDriver;

    public static AppiumDriver returnDriveCapabilities(String platform) throws Exception {

        AppiumDriver<?> driver;
        DesiredCapabilities cap =  new DesiredCapabilities();

        switch(platform.toLowerCase()) {
            case "ios":
                driver = AppiumConfig.iosCapabilities(cap);
                break;
            case "android":
                driver = AppiumConfig.androidCapabilities(cap);
                break;
            default:
                throw new Exception("Plataforma não suportada");
        }

        return driver;
    }

    public static AndroidDriver androidCapabilities(DesiredCapabilities cap) throws MalformedURLException {

       // cap.setCapability(MobileCapabilityType.APP, new File(Utils.readPropertyArchive("app.android.path")).getAbsolutePath());
        cap.setCapability("platformName", "Android");
       // cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, Utils.readPropertyArchive("device.android.name"));
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, Utils.readPropertyArchive("platform.android.version"));
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60 * 2);
        cap.setCapability("appPackage","");
        cap.setCapability("appActivity", "");
        cap.setCapability(MobileCapabilityType.FULL_RESET, false);
        return androidDriver = new AndroidDriver(new URL("http://" + Utils.readPropertyArchive("address") + ":" + Utils.readPropertyArchive("port") + "/wd/hub"), cap);
    }

    public static IOSDriver iosCapabilities(DesiredCapabilities cap) throws MalformedURLException {

        cap.setCapability(MobileCapabilityType.APP, new File(Utils.readPropertyArchive("app.ios.path")).getAbsolutePath());
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, Utils.readPropertyArchive("device.ios.name"));
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, Utils.readPropertyArchive("platform.ios.version"));
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60 * 2);

        return iosDriver = new IOSDriver(new URL("http://" + Utils.readPropertyArchive("address") + ":" + Utils.readPropertyArchive("port") + "/wd/hub"), cap);
    }

}
