Feature: Validate the Search function

Scenario: Validate search by searching for mobile

Given User is in the home page
When User enters keyword in the search field
|Mobile|Keyboard|
And User click the search button
And User opens the first product in the new tab 
Then User takes a screenshot