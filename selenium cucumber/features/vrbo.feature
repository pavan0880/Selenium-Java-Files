
Feature: vrbo

  @tag1
  Scenario: search bar and date
    Given launch vrbo website
    When i click on search field 
    Then it will show list of places
    When i click on arive and departure date fields 
    Then it show the date
    When select the all feilds click on search 
    Then it need to display according to our search places
    