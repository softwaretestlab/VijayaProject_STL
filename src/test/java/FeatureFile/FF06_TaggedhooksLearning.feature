Feature: This is Second feature

  #@First and @Second are local hooks, which will be executed only for these scenarios
  @First
  Scenario: This is Third Scenario
    Given this is Third given
    Then This is Third then
  @Second
  Scenario: This is Fourth Scenario
    Given this is Fourth given
    Then This is Fourth then

#  tagged @Before("@First") and  @After("@First")
#  will run only for that particular Scenario