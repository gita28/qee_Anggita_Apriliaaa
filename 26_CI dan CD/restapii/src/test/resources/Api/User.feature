Feature: User
  As an adn
  i want to see list of user
  so that i oan create new user

  Scenario: Get - As admin i have be able to get deatil user
    Given I set Get api endpoint
    When I send Get HTTP request
    Then I ereceive valid HTTP response code 200
    And