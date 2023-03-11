@etsy
 Feature: Etsy search functionality
  Agile Story: User should be able to type any keyword and see relevant information

Scenario: Etsy Title verification
 Given user is on the Etsy homepage
 Then user should see title is as expected
 # exoectedTitle: Etsy - Shop for handmade, vintage, custom, and unique gifts for
 #everyone

  Scenario: Etsy Search Functionality Title Verification (without parameterization)
   Given user is on the Etsy homepage
   When user types Wooden Spoon in the search box
   And user click to Etsy search button
   Then user sees Wooden Spoon is in the title

  Scenario: Etsy Search Functionality Title Verification (with parameterization)
   Given user is on the Etsy homepage
   When user types "Keyboard" in the search box
   And user click to Etsy search button
   Then user sees "Keyboard" is in the title