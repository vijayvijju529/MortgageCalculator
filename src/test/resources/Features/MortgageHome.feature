@Test
Feature: Google Mortgage Calculator

@Test1
  Scenario: Verification of Google Mortgage Calculator
   Given User launce Chrome Browser
   When User Opens url "https://www.google.com/"
    And User enters Google Mortgage Calculator and click search
   Then Mortgage Calculator is displayed
   And close the browser
    
  @Test2  
 Scenario: Calcualting the Monthly Payment
    Given User launce Chrome Browser
    When User Opens url "https://www.google.com/"
  And User enters Google Mortgage Calculator and click search
  Then Mortgage Calculator is displayed
   And Enter the amount and interest rate
    Then Check the Monthly payments
   And close the browser
   
   
  #NegativeTesting  
   @Test3
   Scenario: Calcualting the Invalid Mortage Amount 
    Given User launce Chrome Browser
    When User Opens url "https://www.google.com/"
  And User enters Google Mortgage Calculator and click search
  Then Mortgage Calculator is displayed
   And Enter the invalid mortgage amount and valid interest rate
    Then No amount is displayed
   And close the browser
   
#NegativeTesting   
   
    @Test4 
   Scenario: Calcualting the Invalid Interest rate 
    Given User launce Chrome Browser
    When User Opens url "https://www.google.com/"
  And User enters Google Mortgage Calculator and click search
  Then Mortgage Calculator is displayed
   And Enter the mortgage amount and invalid interest rate
    Then check the monthly payments for default interest rate value 
   And close the browser
    