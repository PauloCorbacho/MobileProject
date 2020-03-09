Feature: login

  Scenario: realizar login no app

    Given eu estou na tela de login
    And envio um usuario e senha validos
    When clico no botão entrar
    Then o login deverá ser feito