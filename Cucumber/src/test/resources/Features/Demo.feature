Feature: Login to functionalities;

  Scenario: Check login in valid credentials
    Given User is on Login page
    When User enterer valid UserName and password
    And Click on login button
    Then User navigate to the Home page.
