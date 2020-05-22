package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import setup.AppiumConfig;

public class HomePage extends AppiumConfig {

    @FindBy(xpath = "[//android.widget.textButton[@content-desc='trnsacoes']")
    protected WebElement abaTransacoes;
    
    public HomePage(AppiumDriver<?> driver) {
    }
}