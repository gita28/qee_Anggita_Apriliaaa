Feature: Homepage


  Scenario: As a user I have to be able to page home
    Given I am on the home page
    When I click Button Go To BookStore
    And I click Button Delete All Books
    Then I go to bookstore page