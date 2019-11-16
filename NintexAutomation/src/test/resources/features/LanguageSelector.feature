#Author: amarasingheai@gmail.com
@Language-Selector
Feature: Testing to validate Japanies language selector.
  In order to validate that

  @Language-Selector-Japanies
  Scenario: Validate Japanies language selector
    Given I am on the Home Page "http://www.nintex.com" of Nintex website
    When I move to the language menu
    | Menu |
    | EN   |
    | FR   |
    | DE   |
    | JP   | 
    And I move to Japanies language option
    And click on "JP" link
    Then I should see new tab open with japanies language
    And the page title should be "Nintex"
    And the page url shoud be "https://www.nintex.jp/"
    

