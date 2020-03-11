package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import org.junit.Test;
import pages.PageLogin;
import setup.TestRunner;

public class StepsLogin {
    protected AppiumDriver<?> driver = TestRunner.driver;
    @Test
    @Given("^eu estou na tela de login$")
    public void euEstouNaTelaDeLogin() {
        PageLogin pageLogin = new PageLogin(driver);
        pageLogin.acessarATelaDeLogin();
    }
    @Test
    @And("^envio um usuario e senha validos$")
    public void envioUmUsuarioESenhaValidos() {
        PageLogin pageLogin = new PageLogin(driver);
        pageLogin.enviarDadosDelogin("84923210087","301955");
    }

    @Test
    @When("^clico no botão entrar$")
    public void clicoNoBotãoEntrar() {
       // acessarMinhaConta.click();
    }

    @Test
    @Then("^o login deverá ser feito$")
    public void oLoginDeveráSerFeito() {
        //assert com a validação
    }

    @And("^envio um usuario \"([^\"]*)\"$")
    public void envioUmUsuario(String usuario) throws Throwable {
        PageLogin pageLogin = new PageLogin(driver);
        pageLogin.preencherCpfCnpj(usuario);
    }

    @And("^envio uma senha \"([^\"]*)\"$")
    public void envioUmaSenha(String senha) throws Throwable {
        PageLogin pageLogin = new PageLogin(driver);
        pageLogin.preencherSenha(senha);
    }

    @Then("^o login não deverá ser feito$")
    public void oLoginNãoDeveráSerFeito() {
        //Assert com a validação
    }
}
