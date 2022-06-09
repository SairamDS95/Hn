$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/har.feature");
formatter.feature({
  "name": "Validate the Search function",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate search by searching for mobile",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is in the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchStepDef.user_is_in_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters keyword in the search field",
  "rows": [
    {
      "cells": [
        "Mobile",
        "Keyboard"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "SearchStepDef.user_enters_keyword_in_the_search_field(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStepDef.user_click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens the first product in the new tab",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStepDef.user_opens_the_first_product_in_the_new_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User takes a screenshot",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepDef.user_takes_a_screenshot()"
});
formatter.result({
  "status": "passed"
});
});