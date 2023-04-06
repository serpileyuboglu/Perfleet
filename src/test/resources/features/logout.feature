@PER10-244
Feature: Log out functions
  As a user, I should be able to log out

  @PER10-335
  Scenario: user should log out using the log-out button inside
  the profile info and end up on the login page.

    Given user is on the  login page
    And user enters "user1" and "UserUser123"
    When user click log-out button
    Then user is on the  login page

  @PER10-336
  Scenario: user should not go to the home page by by clicking
  the step back button after successfully logging out.
    Given user clicks the step back button
    Then user should not go back home page