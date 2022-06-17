@tag
Feature: Feature to test kumparan.com

  @bug1
  Scenario: The number of like is increase when non login choose love icon
    Given user access kumparan homepage
    And user access cara menulis di kumparan page
    When user choose love icon
    And user back from login page
    Then the number of like should not updated

  @bug2
  Scenario: Content not found when access Opini & Cerita via comment page on non-login user
    Given user access kumparan homepage
    And user access Opini page
    When user choose comment icon on article
    Then comment section should displayed

  @bug3
  Scenario: No content yet when access News from mom article on non-login user
    Given user access kumparan homepage
    And user access Mom page
    And user choose article on Mom Page
    And user choose love on mom article
    When user access News page from mom article
    Then news page should displayed

  @bug4
  Scenario: Trending not displayed when access from mom article on non-login user
    Given user access kumparan homepage
    And user access Mom page
    And user choose article on Mom Page
    And user choose love on mom article
    When user access Trending page from mom article
    Then trending page should displayed

  @bug5
  Scenario: Opini & Cerita not loaded when access from mom article on non-login user
    Given user access kumparan homepage
    And user access Opini page
    And user access Mom page
    And user do refresh the page
    And user choose article on Mom Page
    And user choose love on mom article
    When user access Opini page from mom article
    Then article on opini page should loaded
    
  @test-case
  Scenario Outline: Verify kumparan menu pages displayed
    Given user access kumparan homepage
    When user access <menu> page
    Then <menu> page should displayed

    Examples: 
      | menu          |
      | News          |
      | Entertainment |
      | Woman         |
      | Bisnis        |
      | Food & Travel |
      | Tekno & Sains |
      | Buzz          |
      | Otomotif      |
      | Mom           |
      | Bola & Sports |
