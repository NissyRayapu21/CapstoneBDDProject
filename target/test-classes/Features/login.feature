Feature: Login Registration Functionality in HealthCare

@Regression
Scenario: Successful Register
Given user is on a home page
And user clicks on Myaccount 
And user enters valid required data "<Username>" "<Email>" "<Password>"
And user clicks on register button    
Examples:
   |Username|Email|Password|
   |Jessy|jessy@gmail.com|jes!@$%^21|

@Regression
Scenario: Successful Login

Given user on home page
And user clicks on MyAccount
And user enters valid data "<Email>" "<Password>"
And user clicks on login button

Examples:
    |Email|Password|
    |jessy@gmail.com|jes!@$%^21|

@Regression
Scenario: Invalid Credentials
Given user is on home page
And user click on MyAccount
And user enter invalid data "<Email>" "<Password>"   
And user click on login button
Examples:
    |Email|Password|
    |jessy@gmail.com|jes!@$%21aa|