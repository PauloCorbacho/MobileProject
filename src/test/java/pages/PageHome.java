package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import setup.Setup;

public class PageHome extends Setup {

    @FindBy(xpath = "")
    protected WebElement abaTransacoes;

    @FindBy(xpath = "")
    protected WebElement abaExtrato;

    @FindBy(xpath = "")
    protected WebElement abaMeuNegocio;

    @FindBy(xpath = "")
    protected WebElement abaAjuda;

}