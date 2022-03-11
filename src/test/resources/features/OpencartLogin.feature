Feature: OpencartLogin function

#Scenario: Valid Login
#When User is on opencart home page
#And User navigates to login page
#Given User login with credentials
#Then User navigate to My Account page

#Scenario: Valid Login
#When User is on opencart home page
#And User navigates to login page
#Given User login with "trainer1@rjpinfotek.com" and "testuser"
#Then User navigate to My Account page

#Scenario: InValid Login
#When User is on opencart home page
#And User navigates to login page
#Given User login with "trainer1@rjpinfotek.com" and "testuser12"
#Then Should display Error Msg

Scenario Outline: Valid Login
When User is on opencart home page
And User navigates to login page
Given User login with "<email>" and "<password>"
Then User navigate to My Account page
 
Examples:
  | email | password |
  | trainer1@rjpinfotek.com | testuser |
  | trainer12@gmail.com | testuser2 |
  
  
 # Scenario Outline: Valid Login
#When User is on opencart home page
#And User navigates to login page
#Given User login with credentials
   # | email | pwd |
  #  | trainer1@rjpinfotek.com | testuser |
    
#Then User navigate to My Account page
#And User search item
  #  | phone |
   