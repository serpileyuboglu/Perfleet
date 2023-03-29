
@PER10-229
Feature: Perfleet app login with valid credential
  As a user, I should be able to log in with valid credentials to different user type.
  User should land on the "Dashboard" page

  Users:Driver,Sales Manager and Store Manager

  Background:User is on the login page
    Given user is on the perfleet login page

  @PER10-226
  Scenario:Login as a Driver
    When user enters driver username
    And user enters driver password
    Then user should see the dashboard

  @PER10-227
  Scenario:Login as a Sales Manager
    When user enters Sales Manager username
    And user enters Sales Manager password
    Then user should see the dashboard

  @PER10-228
  Scenario:Login as an Store Manager
    When user enters Store Manage username
    And user enters Store Manage password
    Then user should see the dashboard

  @PER10-241
  Scenario Outline: User should NOT be able to login with invalid credentials
  Enter invalid credentials or empty fields give warning message

    When the user enters invalid or "<username>" and "<password>"
    And User clicks Login Button
    Then warning "<message>" should be displayed

    Examples:
      | username | password    | message                        |
      | user11   | wrong       | Invalid user name or password. |
      | wrong    | UserUser123 | Invalid user name or password. |
      | wrong    | wrong       | Invalid user name or password. |


  @PER10-242
  Scenario Outline: User should NOT be able to login with empty credentials
  Enter  empty fields give warning message


    When the user enters empty  "<username>" or "<password>"
    Then error "<message>" should be displayed

    Examples:
      | username | password    | message                    |
      |          | UserUser123 | Please fill in this field. |
      | user11   |             | Please fill in this field. |
      |          |             | Please fill in this field. |

  @PER10-243
  Scenario Outline: User should see his own "username" in the profile menu,after login

    When User enters with valid "<username>" and "<password>" credentials
    Then User should see his "<username>" in the profile menu


    Examples:
      | username        | password    |
      | user1           | UserUser123 |
      | storemanager51  | UserUser123 |
      | salesmanager101 | UserUser123 |