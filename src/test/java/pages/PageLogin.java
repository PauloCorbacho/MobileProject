package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageLogin extends PageObject {
    public PageLogin(AppiumDriver<?> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "[//android.widget.textButton[@content-desc='CADASTRADO']")
    protected MobileElement jaSouCadastradoButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='buttonSignUp']")
    protected MobileElement queroMeCadastrar;

    @AndroidFindBy(xpath = "")
    protected MobileElement campoCpfCpnj;

    @AndroidFindBy(xpath = "")
    protected MobileElement campoSenha;

    @AndroidFindBy(xpath = "")
    protected MobileElement acessarMinhaConta;

    @AndroidFindBy(xpath = "")
    protected MobileElement criarMinhaConta;

    @AndroidFindBy(xpath = "")
    protected MobileElement esqueciMinhaSenha;

    public void acessarATelaDeLogin(){
        jaSouCadastradoButton.click();
    }

    public void preencherCpfCnpj(String cpfCnpj){
        campoCpfCpnj.sendKeys(cpfCnpj);
    }

    public void preencherSenha(String senha){
        campoSenha.sendKeys(senha);
    }

    public void enviarDadosDelogin(String cpfCnpj, String senha){
            campoCpfCpnj.sendKeys(cpfCnpj);
            campoSenha.sendKeys(senha);
    }

}
