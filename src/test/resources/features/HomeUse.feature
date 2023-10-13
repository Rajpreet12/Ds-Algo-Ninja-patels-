@tag
Feature: DS-AlGO Project

Scenario: Navigate to portal page 
    Given The user opens DS-Algo portal link
    And   The user clicks the Get Started button
    And   The user should be redirected to homepage
    When  The user clicks get started button
    And   The user clicks Data structure drop down
    And   The user selects any data structures item from dropdown without sign in
   Then    It should alert the user with a message You are not Logged in.
   