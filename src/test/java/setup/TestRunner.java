package setup;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.appium.java_client.AppiumDriver;
import util.Utils;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/"
        , glue = {""}
        , plugin = { "pretty",
        "junit:src/test/java/reports/RelatorioCucumber.xml"}
)

public class TestRunner {

    public static AppiumDriver<?> driver;

    @BeforeClass
    public static void setup() throws Exception {
        driver = AppiumConfig.returnDriveCapabilities(Utils.readPropertyArchive("run.platform"));
    }

    @After
    public static void resetApp() {
        driver.resetApp();
    }

    @AfterClass
    public static void tearDown() {

        driver.quit();
    }

}
