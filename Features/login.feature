Feature: Login functionality


Scenario: login with valid password and valid user name
Given user launch browser and enters url
When user click on login button
And user enter valid user name and password
Then user shoulg see success message
And clouse browser
