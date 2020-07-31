$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/AdactinFeaturefiles/Loginpage.feature");
formatter.feature({
  "line": 1,
  "name": "Adactin Login page",
  "description": "",
  "id": "adactin-login-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify the user login",
  "description": "",
  "id": "adactin-login-page;verify-the-user-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of the login page is adactin",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"Ishaanviaan\" and \"ishaan123\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user click Login button in Login page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user verify the username displayed in homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User click logout",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepdef.user_launch_the_adactin_application()"
});
formatter.result({
  "duration": 3107606100,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.title_of_the_login_page_is_adactin()"
});
formatter.result({
  "duration": 12167200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ishaanviaan",
      "offset": 13
    },
    {
      "val": "ishaan123",
      "offset": 31
    }
  ],
  "location": "AdactinStepdef.user_enters_and(String,String)"
});
formatter.result({
  "duration": 661049900,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.user_click_Login_button_in_Login_page()"
});
formatter.result({
  "duration": 2127584100,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.user_verify_the_username_displayed_in_homepage()"
});
formatter.result({
  "duration": 62033700,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.user_click_logout()"
});
formatter.result({
  "duration": 2985039700,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "Verify the user login",
  "description": "",
  "id": "adactin-login-page;verify-the-user-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@usingexamples"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "title of the login page is adactin",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user click Login button in Login page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user verify the username displayed in homepage \"\u003ccondition\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "adactin-login-page;verify-the-user-login;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "condition"
      ],
      "line": 21,
      "id": "adactin-login-page;verify-the-user-login;;1"
    },
    {
      "cells": [
        "Ishaanviaan",
        "ishaan123",
        "valid"
      ],
      "line": 22,
      "id": "adactin-login-page;verify-the-user-login;;2"
    },
    {
      "cells": [
        "xyxyxyxy",
        "sade",
        "invalid"
      ],
      "line": 23,
      "id": "adactin-login-page;verify-the-user-login;;3"
    },
    {
      "cells": [
        "Ishaanviaan",
        "ishaan123",
        "valid"
      ],
      "line": 24,
      "id": "adactin-login-page;verify-the-user-login;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 22,
  "name": "Verify the user login",
  "description": "",
  "id": "adactin-login-page;verify-the-user-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@usingexamples"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "title of the login page is adactin",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user enters \"Ishaanviaan\" and \"ishaan123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user click Login button in Login page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user verify the username displayed in homepage \"valid\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepdef.user_launch_the_adactin_application()"
});
formatter.result({
  "duration": 2801687300,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.title_of_the_login_page_is_adactin()"
});
formatter.result({
  "duration": 6914900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ishaanviaan",
      "offset": 13
    },
    {
      "val": "ishaan123",
      "offset": 31
    }
  ],
  "location": "AdactinStepdef.user_enters_and(String,String)"
});
formatter.result({
  "duration": 548765100,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.user_click_Login_button_in_Login_page()"
});
formatter.result({
  "duration": 1544456800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valid",
      "offset": 48
    }
  ],
  "location": "AdactinStepdef.user_verify_the_username_displayed_in_homepage(String)"
});
formatter.result({
  "duration": 3163383600,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Verify the user login",
  "description": "",
  "id": "adactin-login-page;verify-the-user-login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@usingexamples"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "title of the login page is adactin",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user enters \"xyxyxyxy\" and \"sade\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user click Login button in Login page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user verify the username displayed in homepage \"invalid\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepdef.user_launch_the_adactin_application()"
});
formatter.result({
  "duration": 2538360500,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.title_of_the_login_page_is_adactin()"
});
formatter.result({
  "duration": 24157900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xyxyxyxy",
      "offset": 13
    },
    {
      "val": "sade",
      "offset": 28
    }
  ],
  "location": "AdactinStepdef.user_enters_and(String,String)"
});
formatter.result({
  "duration": 519673600,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.user_click_Login_button_in_Login_page()"
});
formatter.result({
  "duration": 920172300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "invalid",
      "offset": 48
    }
  ],
  "location": "AdactinStepdef.user_verify_the_username_displayed_in_homepage(String)"
});
formatter.result({
  "duration": 25424900,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Verify the user login",
  "description": "",
  "id": "adactin-login-page;verify-the-user-login;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@usingexamples"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "title of the login page is adactin",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user enters \"Ishaanviaan\" and \"ishaan123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user click Login button in Login page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user verify the username displayed in homepage \"valid\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepdef.user_launch_the_adactin_application()"
});
formatter.result({
  "duration": 3159451400,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.title_of_the_login_page_is_adactin()"
});
formatter.result({
  "duration": 13988300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ishaanviaan",
      "offset": 13
    },
    {
      "val": "ishaan123",
      "offset": 31
    }
  ],
  "location": "AdactinStepdef.user_enters_and(String,String)"
});
formatter.result({
  "duration": 602943000,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.user_click_Login_button_in_Login_page()"
});
formatter.result({
  "duration": 2532177000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valid",
      "offset": 48
    }
  ],
  "location": "AdactinStepdef.user_verify_the_username_displayed_in_homepage(String)"
});
formatter.result({
  "duration": 3401077400,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Verify the user login with multiple credentials using datadriven",
  "description": "",
  "id": "adactin-login-page;verify-the-user-login-with-multiple-credentials-using-datadriven",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@usingdatadriven"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "User launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "title of the login page is adactin",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "user get username and password from excel file",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepdef.user_launch_the_adactin_application()"
});
formatter.result({
  "duration": 3223036600,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.title_of_the_login_page_is_adactin()"
});
formatter.result({
  "duration": 9802300,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.user_get_username_and_password_from_excel_file()"
});
formatter.result({
  "duration": 31700966900,
  "status": "passed"
});
});