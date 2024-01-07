@wip
Feature:


  Scenario: As a user should login with valid credentials
    Given I make a request with valid credentials
    Then Verify response with status code 200 and response body

  Scenario Outline: negative login

    Given I make a request with invalid "<email>" and "<password>"
    Then Verify response with status code 400

    Examples:
      | email              | password    |
      | Lionelyopmail.com  | Test123456! |
      | Lionel@yopmail.com |             |
      |                    | Test123456! |
      | Lionel@yopmail     | Test123456! |



