Feature: login

    Scenario Outline: log in to the app
        Given I'm at the login screen
        And I send a user "<user>"
        And send a password "<password>"
        When I click the enter button
        Then the login must be done
        Examples:
            | user   | password   |
            | userExample | passwordExample |

    Scenario Outline: login with an invalid user
        Given I'm at the login screen
        And I send a user "<user>"
        And send a password "<password>"
        When I click the enter button
        Then login should not be done
        Examples:
            | user   | password   |
            | InvalidUserExample | password |
            | validUser | InvalidPassword |


