Feature: User Registration

Scenario: user registration with different data

Given user is in registration page
When user enter the following details
 	| Arul | sa@gmail.com | 9999 | chennai |
 	| Raja | ss@gmail.com | 9129 | Bangalore |
Then user registration should be sucessfull

Scenario: user registration with different data

Given user is in registration page
When user enter the following details with columns
	| Name | Email | Ph:No | city |
 	| Arul | sa@gmail.com | 9999 | chennai |
 	| Raja | ss@gmail.com | 9129 | Bangalore |
Then user registration should be sucessfull