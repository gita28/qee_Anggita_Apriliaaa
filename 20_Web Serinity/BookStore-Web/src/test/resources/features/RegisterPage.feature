Feature: Register


  Scenario: As a user I have to be able to register in Bookstore
    Given I am on the Register page
    When I input valid fristname
    And I input valid lastname
    And I input valid username
    And I input valid password
    And click register button
    Then I go to login page