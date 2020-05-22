Feature: login

    Scenario: realizar login no app
    Given eu estou na tela de login
    Given eu estou na tela de login
    And envio um usuario ""
    And envio uma senha ""
    When clico no botão entrar
    Then o login deverá ser feito

    Scenario: realizar o login com usuário inválido
    Given eu estou na tela de login
    And envio um usuario ""
    And envio uma senha ""
    When clico no botão entrar
    Then o login não deverá ser feito



