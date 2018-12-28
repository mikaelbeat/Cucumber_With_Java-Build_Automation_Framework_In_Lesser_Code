Feature: Portal Login

@MobileTest
Scenario: Home page default login
Given User is on Netbanking landing page
When User login into application with "jin" and "1234"
Then Home page is populated
And Cards displayed are "true"

Scenario: Home page default login
Given User is on Netbanking landing page
When User login into application with "john" and "4321"
Then Home page is populated
And Cards displayed are "false"

Scenario: Home page default login
Given User is on Netbanking landing page
When User sign up with following details
| jenny | abcd | jenny@mail.com | Australia | 3234454 |
Then Home page is populated
And Cards displayed are "false"

Scenario Outline: Home page default login
Given User is on Netbanking landing page
When User login into application with <username> and password <password>
Then Home page is populated
And Cards displayed are "true"

Examples:
|username | password |
|user1 	  | pass1    |
|user2 	  | pass2    |
|user3    | pass3    |
|user4    | pass4    |






