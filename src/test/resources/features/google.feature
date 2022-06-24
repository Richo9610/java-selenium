Feature: Test the google search functionality

Scenario:    Search something at google
    Given    navegate to google
    When     search something
    And      Click the Search Button
    Then     Get results