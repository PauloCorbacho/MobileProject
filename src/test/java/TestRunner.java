import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.LoginTests;

@RunWith(Suite.class) //Informa ao JUnit que a execução é do tipo suíte, ou seja, irá executar diversos testes.
@Suite.SuiteClasses({LoginTests.class}) //Informa quais classes de testes serão executadas.
public class TestRunner {
    //A classe que representa a suíte de teste é vazia, mas é a classe responsável por orquestrar a execução dos testes.
}
