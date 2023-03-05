@bingTest
Feature: Bing search functionality
  Agile story: As a user, when I am on the Bing search page
  I should be able to search anything and see relevant results

  Scenario: Bing Search Title verification
    Given user is on the Bing search page
    When  User searches for orange
    Then  user should see orange - Search

  Scenario: Bing Search Title verification
    Given user is on the Bing search page
    When  User searches for "tesla"
    Then  User should see "tesla - Search" - Search

