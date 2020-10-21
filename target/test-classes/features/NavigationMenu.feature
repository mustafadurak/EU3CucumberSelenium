@navigate
Feature: Navigation Menu
  @sales_manager_Test @Test1_vehicles
  Scenario:  Navigating Fleet --> Vehicles
    Given the user is on the login page
    When the user enters the sales manager information
    And the user navigate fleet tab then Vehicles module
    Then the title should be Vehicles
  @db
  @sales_manager_Test @Test2_campaigns
  Scenario:  Navigating Marketing --> Campaigns
    Given the user is on the login page
    When the user enters the sales manager information
    And the user navigate Marketing tab then Campaigns module
    Then the title should be Campaigns

  @sales_manager_Test @Test3_calendars
  Scenario:  Navigating Activities --> Calendar Events
    Given the user is on the login page
    When the user enters the sales manager information
    And the user navigate Activities tab then Calendar Events module
    Then the title should be Calendars