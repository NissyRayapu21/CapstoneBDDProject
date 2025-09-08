Feature: HomePage Validation

@Regression
Scenario: Home Page Validation
Given user is on home page
And user clicks on quittobacco
And user is navigate and views title of page

@Regression
Scenario: Search Functionality
Given user on home page
And user enters books in search bar
And user click on search button
And user is navigated to required page

@Regression
Scenario: About page
Given user on homepage
And user clicks on aboutus
And user is navigated to about page

