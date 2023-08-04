Feature: To validate the login functionality of facebook page
Scenario: Validate the login functionality with Invalid username and Invalid password
Given User should launch the chrome browser and load the url
When User should type username 
And  User should type password
And  User should click the login button
Then  User should navigate to incorrect credential page