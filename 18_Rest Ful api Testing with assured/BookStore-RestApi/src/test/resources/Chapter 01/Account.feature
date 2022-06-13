Feature: Account

  Scenario: Get - User
    Given I set api endopoints for get User
    When I send Http request get User
    Then I receive verify User HTTP response 200
    And I receive valid data get User

  Scenario: POST - User
    Given I set api endopoints for Post User
    When I send Http request Post User
    Then I receive validate User Post the status code is response 200
    And I receive valid data Post User

  Scenario: Delete - User
    Given I set api endopoints for Delete User
    When I send Http request Delete User
    Then I receive validate User Delete the status code is response 200
    And I receive valid data Delete User

  Scenario: POST - Token
    Given I set api endopoints for Post Token
    When I send Http request Post Token
    Then I receive validate Token the status code is response 200
    And I receive valid data Post Token

  Scenario: POST - Authorized
    Given I set api endopoints for Post Authorized
    When I send Http request Post Authorized
    Then I receive validate Authorized the status code is response 200
    And I receive valid data Post Authorized
