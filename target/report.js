$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/login.feature");
formatter.feature({
  "name": "Login page1",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate the login page with valid1",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User in the home page1",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepsDef.user_in_the_home_page(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter the usermane and password1",
  "rows": [
    {
      "cells": [
        "username",
        "sdsdsd"
      ]
    },
    {
      "cells": [
        "pass",
        "ddss"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepsDef.user_has_to_enter_the_usermane_and_password(Integer,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logging into homepage1",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepsDef.user_logging_into_homepage(Integer)"
});
formatter.result({
  "error_message": "junit.framework.AssertionFailedError\r\n\tat junit.framework.Assert.fail(Assert.java:55)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:22)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:31)\r\n\tat org.setpdefinition.LoginStepsDef.user_logging_into_homepage(LoginStepsDef.java:35)\r\n\tat ✽.User logging into homepage1(src/test/resources/Features/login.feature:12)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});