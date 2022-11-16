Feature: To validate the login Functionallity of BlueNotes page
Background:
Given User should launch the chrome and load the url and maximize the window


Scenario: Verify the login functionality with invalid username and invalid password
When User should type the invalid username and invalid password
And User should click the login button
Then User should navigate to incorrect credential page and close  browser



Scenario: Verify with valid username and invalid password
When User should type the valid username and invalid password
And User should click the login button
Then User should navigate to incorrect credential page and close the browser

Scenario: Verify with valid username and valid password
When User should type the valid username and valid password
And User should click the login button
Then User should navigate to correct credential page and close the browser

Scenario: Verify with empty username and empty password
When User should not type the  username and  password
And User should click the login button
Then User should navigate to correct credential page and close the browser


Scenario: Verify the men shopping button
When  User should click the men shopping button
Then User should navigate to mens clothing page and close the browser

Scenario: Verify the women shopping button
When  User should click the women shopping button
Then User should navigate to women clothing page and close the browser

Scenario: Add the particular product in mens shopping to bag
When  User should click the men shopping button and select one and add it to bag
Then User should close the browser

Scenario: Add the particular product in womens shopping to bag
When  User should click the women shopping button and select one and add it to bag
Then User should close the browser

Scenario Outline: Verify with invalid Username and valid password
When User should type the invalid username"<user>" and valid password"<pass>"
And User should click the login button
Then User should navigate to correct credential page and close the browser


Examples:
			|user|pass|
			|selenium@gmail.com|selenium@123|
			|java@gmail.com|java@321|
			|sql@gmail.com|sql@123|


