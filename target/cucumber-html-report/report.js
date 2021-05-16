$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "User Login",
  "description": "I want to check that user can login to the system",
  "id": "user-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "user login successfully",
  "description": "",
  "id": "user-login;user-login-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is in Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "entered valid user name and password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "login succefully and profile page appears",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_is_in_Home_page()"
});
formatter.result({
  "duration": 208560700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.click_on_login_button()"
});
formatter.result({
  "duration": 1603010400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.entered_valid_user_name_and_password()"
});
formatter.result({
  "duration": 1300179600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.login_succefully_and_profile_page_appears()"
});
formatter.result({
  "duration": 913730000,
  "status": "passed"
});
});