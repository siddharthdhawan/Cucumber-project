Feature: Search

Scenario Outline: Search battery and verify the text
	Given Initialize the browser with chrome
    And Navigate to "https://oralb.com" site
    And Click on search icon 
    When User send <text> in searchbox
    And Click on search button 
    Then Click on product filter
    Then click on next page
    Then click on product
    Then Verify the "3D White" is present in details
    Then Terminate browser
    
    Examples:
    	|text	|
    	|battery|