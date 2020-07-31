Feature: Adactin search page

Background: Verify the user login
  Given User launch the adactin application
  When title of the login page is adactin
  When user enters "Ishaanviaan" and "ishaan123"
  And user click Login button in Login page
  Then user verify the username displayed in homepage
  
Scenario Outline: Verify for error message when check in date is greater than checkout date
Given customer select location as "<Location>"
When user select number of rooms as "<NOR>"
When customer enters check-in date "<checkin_date>"
Then customer enters check-out date "<checkout_date>" less than check-in date
When customer selects number of adults as "<APR>"
And user click search button
Then Then verify for the error message for check-in date field

Examples:
|	checkin_date	|	checkout_date	|	Location	|	NOR				|	APR				|
	|	10/04/2020	    |	09/04/2020		|	Sydney		|	1 - One			|	1 - One			|
	

 @test3 
Scenario Outline: Verify for user can book hotel
Given customer select location as "<Location>"
When user select number of rooms as "<NOR>"
When customer enters check-in date "<checkin_date>"
Then customer enters check-out date "<checkout_date>" less than check-in date
When customer selects number of adults as "<APR>"
And user click search button
Then user verify location displayed in select hotel is same as location selected in searchpage
And User click logout
Examples:
|	checkin_date	|	checkout_date	|	Location	|	NOR				|	APR				|
	|	15/04/2020	    |	02/05/2020		|	Sydney		|	1 - One			|	1 - One			|

  