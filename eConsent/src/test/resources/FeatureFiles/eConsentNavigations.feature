@tag10
Feature: Acceptance testing to validate eConsent Page is working.
  In order to validate that 
  the eConsent Page is working
  Doing the Acceptance Testing

  @tag11
  Scenario: Validate eConsent page.
    Given I navigate to the  Home Page "https://www.medidata.com/en" of Medidata website
    And I move to Products Services Menu
    And click on "eConsent" link
    Then I should see eConsent page

  @tag12
  Scenario: Validate Webinar access
    Given I click on watch eConsent Webinar link
    Then I should see Webinar registation page
    When I click on watch the webcast button
    Then I should see error message.


  @tag13
  Scenario Outline: Validat Webinar form fill up
    Given I am on webinar registration page
    And I enter First Name "<firstname>"
    And I enter Last Name "<lastname>"
    And I enter Business Email "<businessemail>"
    And I enter Phone Number "<phonenumber>"
    And I enter Title "<title>"
    And I select Level "<level>"
    And I select Functional Area "<functionalarea>"
    And I enter Company "<company>"
    And I select Country "<country>"
    And I select the policy acceptance checkboxs
    
    Examples: 
      | firstname | lastname  | businessemail      | phonenumber | title      | level | functionalarea      | company     | country |
      | Rohan     | Bhor      | rohan.bhor@3ds.com |    99999999 | TestTitle  | VP    | Academic            | TestCompany | India   |
      
