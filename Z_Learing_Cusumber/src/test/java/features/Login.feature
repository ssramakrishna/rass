Feature: Login

  Scenario: Login by using valid credentials
    Given browser is open
    And application is displayed		
    When user clicks on login link
    And user enters valid credentials
    And user clicks on ogin button
    Then user must be successfully logged in
    And browser closes
    
    