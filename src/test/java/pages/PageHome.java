package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import setup.AppiumConfig;

public class PageHome extends AppiumConfig {

    @FindBy(xpath = "")
    protected WebElement abaTransacoes;

    @FindBy(xpath = "")
    protected WebElement abaExtrato;

    @FindBy(xpath = "")
    protected WebElement abaMeuNegocio;

    @FindBy(xpath = "")
    protected WebElement abaAjuda;

}