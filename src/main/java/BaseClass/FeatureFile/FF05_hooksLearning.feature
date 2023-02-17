Feature: This is first feature
  #  @before and @after are global hooks
  # @before and @after hooks will run for each feature file inside "FeatureFile" package
  # let image if they are multiple scenarios inside a feature file
  # Then @before and @after hooks will run for each scenario
  Scenario: This is first scenario
    Given this is first given
    Then this is first then

  Scenario: This is second Scenario
    Given this is second given
    Then This is second then