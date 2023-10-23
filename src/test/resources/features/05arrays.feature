@tag
Feature: Arrays
  I want to use this template for my feature file

@tag1
Scenario: Arrays in python
Given The user is in the Array page after logged in
When clicks Arrays in Python link user should be redirected to Arrays in Python page
When The user clicks Try Here button in Arrays in Python page	
Then The user should be redirected to a page having an tryEditor with a Run button to test1	
 
@tag2
Scenario: Arrays using List
Given The user is in the Array page after logged in
When clicks Arrays using List user should be redirected to Arrays using List page
When The user clicks Try Here button in Arrays using List page	
Then The user should be redirected to a page having an tryEditor with a Run button to test1	

@tag3
Scenario: Basic operations in List
Given The user is in the Array page after logged in
When clicks Basic operations in List user should be redirected to Basic operations in List page
When The user clicks Try Here button in Basic operations in List page	
Then The user should be redirected to a page having an tryEditor with a Run button to test1	
 
@tag4
Scenario: Applications of Array
Given The user is in the Array page after logged in
When clicks Applications of Array user should be redirected to Applications of Array  page
When The user clicks Try Here button in Applications of Array page	
Then The user should be redirected to a page having an tryEditor with a Run button to test1	

@tag5

Scenario: Practice questions
Given The user clicks Practice Questions in Applications of Array page user should be redirected to practice page
When The user clicks Search the array link	
Then The user should be redirected to Question page contains question1, a tryEditor with Run and Submit buttons
And The user navigates back to the Practice page
When The user clicks Max Consecutive Ones link	
Then The user should be redirected to Question page contains question2, a tryEditor with Run and Submit buttons
And The user navigates back to the Practice page
When The user clicks Find Numbers with Even Number of Digits link	
Then The user should be redirected to Question page contains question3, a tryEditor with Run and Submit buttons
And The user navigates back to the Practice page
When The user clicks Squares of a Sorted Array link	
Then The user should be redirected to Question page contains question4, a tryEditor with Run and Submit buttons
