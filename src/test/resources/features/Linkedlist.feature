@tag
Feature: LinkedList Page
Background: 
Given The user is in the Linkedlist page after loggedin
 
  Scenario: Introduction Page
    
    When The user clicks Introduction button
    Then The user should be directed to Linked list page
    And The user clicks Try Here button
    Then The user should be redirected to a page having an tryEditor with a Run button test
    

  Scenario Outline: Creating a Linked list Page
    
    When The user clicks Creating a Linked List button
    Then The user should be directed to Creating a Linked list page
    And The user clicks Try Here button1
    Then The user should be redirected to a page having an tryEditor with a Run button test1
    

  Scenario Outline: Types of Linked list Page
    
    When The user clicks Types of Linked List button
    Then The user should be directed to Types a Linked list page
    And The user clicks Try Here button2
    Then The user should be redirected to a page having an tryEditor with a Run button test2
  
 
   Scenario Outline: Implement Linked list in Python 
    
    When The user clicks Implement Linked List in Python button
    Then The user should be directed to Implement Linked list in python page
    And The user clicks Try Here button3
    Then The user should be redirected to a page having an tryEditor with a Run button test3 
    

 Scenario Outline: Traversal Page
    
    When The user clicks Traversal button
    Then The user should be directed to Traversal Page
    And The user clicks Try Here button4
    Then The user should be redirected to a page having an tryEditor with a Run button test4
    
  
 Scenario Outline: Insertion Page
    
    When The user clicks Insertion button
    Then The user should be directed to Insertion Page
    And The user clicks Try Here button5
    Then The user should be redirected to a page having an tryEditor with a Run button test5
    
 
 Scenario Outline: Deletion Page
    
    When The user clicks Deletion button
    Then The user should be directed to Deletion Page
    And The user clicks Try Here button6
    Then The user should be redirected to a page having an tryEditor with a Run button test6 
 
 
 Scenario Outline: Practise Questions
    
    Then The user clicks Practise Questions button
    
    
     
   
