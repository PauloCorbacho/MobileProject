package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageLogin {

    @FindBy(xpath = "//android.widget.TextView[@content-desc='buttonLogin']")
    protected WebElement jaSouCadastradoButton;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='buttonSignUp']")
    protected WebElement queroMeCadastrar;

    @FindBy(xpath = "")
    protected WebElement cpfCpnj;

    @FindBy(xpath = "")
    protected WebElement senha;

    @FindBy(xpath = "")
    protected WebElement acessarMinhaConta;

    @FindBy(xpath = "")
    protected WebElement criarMinhaConta;

    @FindBy(xpath = "")
    protected WebElement esqueciMinhaSenha;
}
