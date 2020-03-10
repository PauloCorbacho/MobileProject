package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import steps.StepsLogin;

@RunWith(Suite.class) //Informa ao JUnit que a execução é do tipo suíte, ou seja, irá executar diversos testes.
@Suite.SuiteClasses({StepsLogin.class}) //Informa quais classes de testes serão executadas.
public class TestRunner {
}
