Feature: Application Login Page


Scenario: Verify user is able to login to the application
Given User opens the login page
When User provides the user necessary details
	|	Fields		|	Values		|
	|	First name	| 	Varun		|
	|	Surname		|	Kumar		|
	|   Email		|  varun@gmail	|
	|   Password	|	varun123	|
	|	DOB			|  26-Jun-1994	|
	|	Gender		|	 Male		|
Then User should be successfully landed in the home page