Feature: Adactin Login page

@test
Scenario: Verify the user login
  Given User launch the adactin application
  When title of the login page is adactin
  When user enters "Ishaanviaan" and "ishaan123"
  And user click Login button in Login page
  Then user verify the username displayed in homepage
  And User click logout 
 
@usingexamples 
 Scenario Outline: Verify the user login
  Given User launch the adactin application
  When title of the login page is adactin
  When user enters "<username>" and "<password>"
  And user click Login button in Login page
  Then user verify the username displayed in homepage "<condition>"
  
  Examples:
  |username|password|condition|
  |Ishaanviaan|ishaan123|valid|
  |xyxyxyxy|sade|invalid|  
  |Ishaanviaan|ishaan123|valid|


@usingdatadriven
Scenario: Verify the user login with multiple credentials using datadriven
  Given User launch the adactin application
  When title of the login page is adactin
  And user get username and password from excel file 
 
 