Feature: Search
  In order to learn more
  As an information seeker
  I want to find more information

  Scenario: I'm feeling lucky
    Given I am on the Wikipedia homepage
    When I search for "dog"
    Then I am shown the "Dog" article
