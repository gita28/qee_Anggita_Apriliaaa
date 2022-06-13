Feature: BookStore

  Scenario: Get - BookStore
    Given I set api endopoints for get BookStore
    When I send Http request get BookStore
    Then I receive verify BookStore get HTTP response 200
    And I receive valid data get BookStore

  Scenario: POST - BookStore
    Given I set api endopoints for Post BookStore
    When I send Http request Post BookStore
    Then I receive validate BookStore Post the status code is response 200
    And I receive valid data Post BookStore

  Scenario: Delete - BookStore
    Given I set api endopoints for Delete BookStore
    When I send Http request Delete BookStore
    Then I receive validate BookStore Delete the status code is response 400
    And I receive valid data Delete BookStore

  Scenario: Delete - BookStoreid
    Given I set api endopoints for Delete BookStoreid
    When I send Http request Delete BookStoreid
    Then I receive validate BookStoreid delete the status code is response 400
    And I receive valid data Delete BookStoreid

  Scenario: Get - BookStoreid
    Given I set api endopoints for get BookStoreid
    When I send Http request get BookStoreid
    Then I receive verify BookStoreid get HTTP response 200
    And I receive valid data get BookStoreid

  Scenario: Put - BookStoreid
    Given I set api endopoints for Put BookStoreid
    When I send Http request Put BookStoreid
    Then I receive validate BookStoreid put the status code is response 200
    And I receive valid data Put BookStoreid


