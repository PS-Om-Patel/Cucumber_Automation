Feature: Login into portal

Background:
Given User is on LoginPage



@Login

Scenario Outline: User login with invalid username and password


When User enter invalid "<username>" and "<password>" and click on login button
Then User gets "<error>" message and access to portal is denied

Examples:
|username|password|error|
|admin|Admin|Invalid credentials|
|om|1234|Invalid credentials|
||password|Required|

@Login

Scenario: User login with valid username and password

When User enter valid username and password and click Login
Then User is redirected to Homepage of OrangeHRM

