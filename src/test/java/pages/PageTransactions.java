package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import setup.AppiumConfig;

public class PageTransactions extends AppiumConfig{
    @FindBy(xpath = "")
    protected WebElement colocarDinheiro;

    @FindBy(xpath = "")
    protected WebElement pagarConta;

    @FindBy(xpath = "")
    protected WebElement transferirDinheiro;

    @FindBy(xpath = "")
    protected WebElement usarCodigoQR;

    @FindBy(xpath = "")
    protected WebElement meuCartao;

    public PageTransactions(){

    }
}
