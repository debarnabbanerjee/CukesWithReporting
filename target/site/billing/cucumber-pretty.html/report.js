$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Testing Login",
  "description": "",
  "id": "login;testing-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I open chrome",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I navigate to the base Url",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I enter userName and Password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on Sigin Link",
  "keyword": "And "
});
formatter.match({
  "location": "steps.i_open_chrome()"
});
formatter.result({
  "duration": 65546779,
  "status": "passed"
});
formatter.match({
  "location": "steps.i_navigate_to_the_base_Url()"
});
formatter.result({
  "duration": 28273,
  "status": "passed"
});
formatter.match({
  "location": "steps.i_enter_userName_and_Password()"
});
formatter.result({
  "duration": 24674,
  "status": "passed"
});
formatter.match({
  "location": "steps.i_click_on_Sigin_Link()"
});
formatter.result({
  "duration": 28787,
  "status": "passed"
});
});