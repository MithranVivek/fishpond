@tag
Feature: Purchase Electronic Items
  #Background:
  

  @tag1
  Scenario: To Purchase the USB Drive 
  Given User Goto the Categories of Electronics
    When user goto the Computers & Accessories
    And goto the Datastorage
    And goto the USB Flash Drivers 
    And select the SanDisk brand
    And select the one USB from list
    And product add to cart
    Then checkout the visiblity of cart page

 @tag2
  Scenario: To Purchase the USB Drive 
    When user login to fishpond oneD map
    |username|mithranvivek91@gmail.com|
    |password|fish@12345|
    And search the USB Drive oneD List
    |USB Drive|
    And select the SanDisk brand
    And select the one USB from list
    And product add to cart
    Then checkout the visiblity of cart page
    And signout the account
