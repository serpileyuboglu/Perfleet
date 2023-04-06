Feature: As a Store Manager, I should be able to add an event


  Background:
    Given user is on the  dashboard page


    Scenario: User can access the "Add Event" page
      When user hover over Fleet module
      And user clicks "vehicle" module
      Then user should be able to see "Add Event" button