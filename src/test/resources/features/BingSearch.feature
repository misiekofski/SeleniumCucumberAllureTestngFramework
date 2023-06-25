Feature: BingSearch for different type of words

  Basic bing search tests that should validate that site is up and running and user has possibility to search something

  @SMOKE
  @regress
  @critical
  @issue=DPD-1
#  @allure.label.jira:DPD-1
  Scenario: Search normal word in bing.com
    Given User is on bing.com webpage
    When User searches for "light beer"
    Then First three results contains "light beer"
    Then number 123 is less than 321

  @blocker
  @tmsLink=1234
  @issue=DPD-2
  Scenario: Search not normal word in bing.com
    Given User is on bing.com webpage
    When User searches for "dark beer"
    Then First three results contains "dark beer"


  @normal
  @tmsLink=3456
  @issue=DPD-3
  @flaky
  @muted
  @known
  Scenario: This test will fail
    Given User is on bing.com webpage
    When User searches for "dark beer"
    Then I want to fail my test
