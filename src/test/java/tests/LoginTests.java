package tests;

import org.junit.Test;
import pages.PageLogin;

public class LoginTests extends PageLogin {

    @Test
    public void realizarLogin() {

    }

    @Test
    public void realizarLoginComCpfInvalido() {
        cpfCpnj.sendKeys("");
        senha.sendKeys("");
        acessarMinhaConta.click();
        //assert com a validação
    }

    @Test
    public void realizarLoginComCnpjInvalido() {
        cpfCpnj.sendKeys("");
        senha.sendKeys("");
        acessarMinhaConta.click();
        //assert com a validação
    }

    @Test
    public void realizarLoginComSenhaInvalida() {
        cpfCpnj.sendKeys("");
        senha.sendKeys("");
        acessarMinhaConta.click();
        //assert com a validação
    }

}
