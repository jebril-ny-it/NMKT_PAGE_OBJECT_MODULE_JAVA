Feature: Social Activities
  In order to preforem social operation in socialWare 
  as a logged in user
  i want to check that i can do post comment like ETCS

  Scenario: Successful post of a status
    Given I open browser chrome
    And I navigate to socialware.com
    When I complete login with valid credentials
    Then I expect profile name as James Mathew
    And I can create & submit a post
