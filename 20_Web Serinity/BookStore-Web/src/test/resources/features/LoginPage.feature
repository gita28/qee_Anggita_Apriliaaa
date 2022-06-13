Feature: Login
  As a user
  I want to login
  So that i can acces my buy books

  Background:

    Given I am on the login page

  @Normal
  Scenario: As a user I have to be able to login in Bookstore
    When I input valid username
    And I input valid password
    And click login button
    Then I go to home page


