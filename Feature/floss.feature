Feature: Floss heading

Scenario: Verifying floss category heading
	Given Initialize the browser with chrome
    And Navigate to "https://oralb.com" site
    And click on floss under shop
    Then verify "GLIDE FLOSS" is present in as heading in a category
    Then Terminate browser
