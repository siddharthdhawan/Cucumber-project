Feature: Kids Brushes

Scenario: Verifing product in kids brushes
    Given Initialize the browser with chrome
    And Navigate to "https://oralb.com" site
    And Click on kids brushes
    Then Verify the text kids is present in the second product
    Then Terminate browser