Feature: HealthCare Program HAging Form

@Regression

Scenario: Form Submission
Given user clicks on programs
And user selects on healthaging 
And user clicks on register here
And user enters firstname "<FirstName>"
And user enters lastname "<LastName>"
And user enters phoneno "<Phone>"
And user enters email "<Email>"
And user enters programs "<program>"
And user enters country "<Country>"
And user enters format "<Format>"
And user enters bestdescribed "<BestDes>"
And user enters aboutus "<AboutUs>"
And user enters notify "<Notify>"
And user clicks on submit "<Submit>"
Then user views message "<SubmittedSuccessfully>"

Examples:
   |FirstName|LastName|Phone     |Email          |Program              |Country |Format       |BestDes                                                  |AboutUs|Notify|SubmittedSuccessfully|
   |OMG      |Jessy   |9876543211|jessy@gmail.com|Tai Chi for Arthritis|Escambia|No preference|A community center, church, or other organization looking to host classes at my own site|Social Media|click |Success |
