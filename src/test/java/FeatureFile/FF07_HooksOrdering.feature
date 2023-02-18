Feature: This is Third feature

  Scenario: This is Fifth Scenario
    Given this is Fifth given
    Then This is Fifth then

  Scenario: This is Sixth Scenario
    Given this is Sixth given
    Then This is Sixth then


#  // these Before and After hooks will run for each scenario in the featureFIle-- global hooks
#  Before(order=0) --> hooks ordering
#  Before(order=1) --> hooks ordering
#  Before
# Background
#  Scenario
#  After
#  After(order=1)
#  After(order=0)