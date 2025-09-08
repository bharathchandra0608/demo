
Feature: User registration and authentication

  Scenario: Signup and login with valid credentials
    Given I am on the Demoblaze home page
    When Sign up modal is open
    And I register with username "hg32" and password "pass123"
    Then I should see an alert with message "Sign up successful."
    When Log in modal is open
    And I login with username "hg32" and password "pass123"
    Then I should see a welcome message with username "hg32"


  
