Feature: Form submission on Tricentis

  Scenario: Fill in and submit all forms
    Given the user is on the Vehicle Data page
    When the user fills in vehicle data
    And the user fills in insurant data
    And the user fills in product data
    And the user selects a price option
    And the user fills in the send quote form
    Then the user should see "Sending e-mail success!" on the screen
