Feature: The SauceDemo Website Login

  Scenario Outline: FIRST - As a user, I can log into the saucedemo application

    Given I am on the login page
    When I login with <username> and <password>
    Then I should navigate to product page with title <title>

    Examples:
      | username      | password     | title    |
      | standard_user | secret_sauce | PRODUCTS |

  Scenario Outline: SECOND - As a user, I can log into the saucedemo application

    Given I am on the login page
    When I login with <username> and <password>
    Then I should navigate to product page with title <title>

    Examples:
      | username      | password     | title    |
      | standard_user | secret_sauce | products |
