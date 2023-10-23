@tag
Feature: Graph
 Background:
 Given The user is in the Graph page after logged in
  
 
  Scenario: Implemention of Graph in Python
    When The user clicks Graph button
    And The user clicks try here button for Graph
    Then The user should be redirected to a page having a tryEditor with a Run button to graph
    
  Scenario: Graph Representations button  
    When The user clicks Graph Representations button
    And The user clicks try here button for graph representations
    Then The user should be redirected to a page having a tryEditor with a Run button to graph rep
    