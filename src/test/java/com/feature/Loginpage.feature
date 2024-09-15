Feature: To Validate login scenarios
Scenario: Validate username and password 
Given Login to application
When enter username "mdibrahim"
And enter password "Iburosy@1"
And click login button
Then Validate the HomePage
