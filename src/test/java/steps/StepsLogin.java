package steps;

import cucumber.api.PendingException;
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

    @Given("^I'm at the login screen$")
    public void iMAtTheLoginScreen() {
        PageLogin pageLogin = new PageLogin(driver);
        pageLogin.acessarATelaDeLogin();
    }
    @And("^I send a user \"([^\"]*)\"$")
    public void iSendAUser(String user) throws Throwable {
        PageLogin pageLogin = new PageLogin(driver);
        pageLogin.preencherCpfCnpj(user);
    }

    @And("^envio um usuario \"([^\"]*)\"$")
    public void envioUmUsuario() throws Throwable {

    }

    @Test
    @And("^envio um usuario e senha validos$")
    public void envioUmUsuarioESenhaValidos() {
        PageLogin pageLogin = new PageLogin(driver);
        pageLogin.enviarDadosDelogin("","");
    }


    @Then("^o login não deverá ser feito$")
    public void oLoginNãoDeveráSerFeito() {
        //Assert com a validação
    }


    @And("^send a password \"([^\"]*)\"$")
    public void sendAPassword(String password) throws Throwable {
        PageLogin pageLogin = new PageLogin(driver);
        pageLogin.preencherSenha(password);
    }

    @When("^I click the enter button$")
    public void iClickTheEnterButton() {
        // acessarMinhaConta.click();
    }

    @Then("^the login must be done$")
    public void theLoginMustBeDone() {
        //Assert com a validação
    }

    @Then("^login should not be done$")
    public void loginShouldNotBeDone() {
        //Assert com a validação
    }
}
