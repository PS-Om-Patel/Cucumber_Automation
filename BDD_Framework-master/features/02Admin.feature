Feature: Portal Admin Actions

Background: 
Given User is on LoginPage
When User enter valid username and password and click Login
Then User is redirected to Homepage of OrangeHRM
Given the Admin user is in the Admin section of the portal

@Admin

Scenario: Admin User can create a new Admin/ESS user

When the user clicks the add button
And inputs valid user details in the Add User form
And clicks the save button
Then the Admin user can create a new user for the portal

@Admin

Scenario: Admin user can locate a specific user

When the Admin user searches using valid user details
And clicks the Search button
Then the Admin user can retrieve the specific uses detail

@Admin1

Scenario: Admin user can modify specific user details

When the Admin user clicks on the edit icon
And modifies the necessary details and clicks on the save button
Then the specific user details are updated accordingly

@Admin

Scenario: Admin user can remove a specific user

When the Admin user clicks on the delete button and confirms the action
Then the specific user is removed from the system


@Admin

Scenario: Admin user can remove multiple user at once

When The Admin user select multiple user thorugh select all 
And hit on Delete Selected button
Then all selected users are deleted

@Admin



Scenario: Admin user can see employee name suggestions

When the Admin user types a partial name in the employee name field
Then the system displays a list of suggestions for the employee name based on input







