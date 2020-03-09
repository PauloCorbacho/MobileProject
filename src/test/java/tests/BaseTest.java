package tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import io.appium.java_client.AppiumDriver;
import setup.AppiumConfig;
import util.Utils;

public class BaseTest {

    protected static AppiumDriver<?> driver;

    @BeforeClass
    public static void setUP() throws Exception {
        driver = AppiumConfig.returnDriveCapabilities(Utils.readPropertyArchive("run.platform"));
    }

    @After
    public void cleanUp() {
        driver.resetApp();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}

