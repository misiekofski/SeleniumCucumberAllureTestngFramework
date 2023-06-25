Feature: BingSearch

  Basic bing search tests that should validate that site is up and running and user has possibility to search something

  @SMOKE
  @regress @critical
#  @allure.label.jira:DPD-1
  Scenario: Search normal word in bing.com
    Given User is on bing.com webpage
    When User searches for "light beer"
    Then First three results contains "light beer"
    Then number 123 is less than 321

  @TC_5645
#  @allure.label.jira:DPD-2
  Scenario: Search not normal word in bing.com
    Given User is on bing.com webpage
    When User searches for "dark beer"
    Then First three results contains "dark beer"


  @high
#  @allure.label.jira:DPD-2
  Scenario: This test will fail
    Given User is on bing.com webpage
    When User searches for "dark beer"
    Then I want to fail my test