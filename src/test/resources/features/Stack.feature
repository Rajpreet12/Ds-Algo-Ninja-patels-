@tag
Feature: Stack page

Background:
Given The user is in the Stack page after logged in
When The user clicks Try Here9 button
Then The user should be redirected to a page having an tryEditor with a Run button to test

Scenario: Navigate to Stack page
  
  When The user clicks Operations in Stack button
  And The user should be directed to Operations in Stack Page
  When The user clicks Implementation button
  And The user should be directed to Implementation Page
  When The user clicks Application button
  And The user should be directed to Application page
  When The user clicks Practice Questions button
  And The user should be redirected to Practise page
  When The users clicks the getting started button in queue pane or drop down menu
  Then The user should be in directed to Queue Page
   