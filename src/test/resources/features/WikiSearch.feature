@wiki
Feature: Wiki Search features


  # WPS-7531
 # Background:
   # Given User is on Wikipedia home page
   # When User types Steve Jobs in the wiki search box
   # And User clicks wiki search button


  Scenario: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title

  Scenario: Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the main header

  Scenario: Wikipedia Search Functionality Image Header Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the image header

  @scenarioOutline
  Scenario Outline: Wikipedia Search Functionality with Scenario Outline
    Given User is on Wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedMainHeader>" is in the main header
    Then User sees "<expectedImageHeader>" is in the image header
    @ceos
    Examples: Search values we are going to use in this outline
      | searchValue     | expectedTitle   | expectedMainHeader | expectedImageHeader |
      | Steve Jobs      | Steve Jobs      | Steve Jobs         | Steve Jobs          |
      | Marry Barra     | Marry Barra     | Marry Barra        | Marry Barra         |
      | Bill Gates      | Bill Gates      | Bill Gates         | Bill Gates          |
      | Sundar Pichai   | Sundar Pichai   | Sundar Pichai      | Sundar Pichai       |


    @scientists
    Examples: Search values we are going to use in this outline
      | searchValue     | expectedTitle   | expectedMainHeader | expectedImageHeader |
      | Albert Einstein | Albert Einstein | Albert Einstein    | Albert Einstein     |
      | Marie Curie     | Marie Curie     | Marie Curie        | Marie Curie         |


