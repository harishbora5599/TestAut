$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test.feature");
formatter.feature({
  "line": 1,
  "name": "Policy quote",
  "description": "As a customer, I want to fill details\nAnd get quotes for policies",
  "id": "policy-quote",
  "keyword": "Feature"
});
formatter.background({
  "line": 6,
  "name": "User navigates to home page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I access URL \"Application_URL\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "Application_URL",
      "offset": 14
    }
  ],
  "location": "StepDefinition.I_access_URL(String)"
});
formatter.result({
  "duration": 1371859027,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Validate user is allowed to fill details fields",
  "description": "",
  "id": "policy-quote;validate-user-is-allowed-to-fill-details-fields",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@test"
    },
    {
      "line": 9,
      "name": "@tc1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I select \"Title\" in \"Home_DetailsPage_TitleOption\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I enter \"First_Name\" in \"Home_DetailsPage_FirstNameField\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter \"Last_Name\" in \"Home_DetailsPage_LastNameField\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select \"DOB_Day\" in \"Home_DetailsPage_DOB_DayOption\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I select \"DOB_Month\" in \"Home_DetailsPage_DOB_MonthOption\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I select \"DOB_Year\" in \"Home_DetailsPage_DOB_YearOption\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Title",
      "offset": 10
    },
    {
      "val": "Home_DetailsPage_TitleOption",
      "offset": 21
    }
  ],
  "location": "StepDefinition.i_select_element(String,String)"
});
formatter.result({
  "duration": 1093727319,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "First_Name",
      "offset": 9
    },
    {
      "val": "Home_DetailsPage_FirstNameField",
      "offset": 25
    }
  ],
  "location": "StepDefinition.i_enter_text(String,String)"
});
formatter.result({
  "duration": 331153526,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Last_Name",
      "offset": 9
    },
    {
      "val": "Home_DetailsPage_LastNameField",
      "offset": 24
    }
  ],
  "location": "StepDefinition.i_enter_text(String,String)"
});
formatter.result({
  "duration": 189153816,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DOB_Day",
      "offset": 10
    },
    {
      "val": "Home_DetailsPage_DOB_DayOption",
      "offset": 23
    }
  ],
  "location": "StepDefinition.i_select_element(String,String)"
});
formatter.result({
  "duration": 125530930,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DOB_Month",
      "offset": 10
    },
    {
      "val": "Home_DetailsPage_DOB_MonthOption",
      "offset": 25
    }
  ],
  "location": "StepDefinition.i_select_element(String,String)"
});
formatter.result({
  "duration": 103363978,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DOB_Year",
      "offset": 10
    },
    {
      "val": "Home_DetailsPage_DOB_YearOption",
      "offset": 24
    }
  ],
  "location": "StepDefinition.i_select_element(String,String)"
});
formatter.result({
  "duration": 120197722,
  "status": "passed"
});
formatter.after({
  "duration": 148330,
  "status": "passed"
});
});