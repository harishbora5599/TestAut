Feature: Policy quote
  As a customer, I want to fill details
  And get quotes for policies
  

  Background: User navigates to home page
    Given I access URL "Application_URL"

  @test @tc1
  Scenario: Validate user is allowed to fill details fields
    When I select "Title" in "Home_DetailsPage_TitleOption"
    And I enter "First_Name" in "Home_DetailsPage_FirstNameField"
    And I enter "Last_Name" in "Home_DetailsPage_LastNameField"
    And I select "DOB_Day" in "Home_DetailsPage_DOB_DayOption"
    And I select "DOB_Month" in "Home_DetailsPage_DOB_MonthOption"
    And I select "DOB_Year" in "Home_DetailsPage_DOB_YearOption"