@tag
Feature: DSAlgo user signin
  I want to use this template for my feature file

  Scenario Outline: Login keeping username and password fields empty
    Given user navigates to  sign-in page
    When user dont enter any credentials and click on login button
    Then It should display an error "Please fill out this field" below username field
   
   Scenario Outline: Login keeping password empty and filling username field
    Given user navigates to  sign-in page
    When user enters username and keep password field empty and click on login button
    Then It should display an error "Please fill out this field" below pwd field 
       
    Scenario Outline: Login with invalid Credentials
    Given user navigates to  sign-in page
    When user enters invalid username and password click on login button
    Then It should display an error "Invalid Username and Password" message
    
   Scenario Outline: Login with invalid user id and valid password combination
    Given user navigates to  sign-in page
    When user enters invalid username and valid password and clicks on login button
    Then It should display an error "Invalid Username and Password" message
   
   Scenario Outline: Login with valid user id and invalid password combination
    Given user navigates to  sign-in page
    When user enters valid username and invalid password and clicks on login button
    Then It should display an error "Invalid Username and Password" message
    
    Scenario Outline: Login with valid Credentials
    Given user navigates to  sign-in page
    When user enters valid username and password click on login button
    Then The user should be redirected to Home Page with the message "You are logged in" and with the user name on the top
    When The user clicks Sign out
    Then User will be logged out
    
    
