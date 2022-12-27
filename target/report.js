$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/electronics.feature");
formatter.feature({
  "name": "Purchase Electronic Items",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "To Purchase the USB Drive",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Goto the Categories of Electronics",
  "keyword": "Given "
});
formatter.match({
  "location": "Electonics.user_Goto_the_Categories_of_Electronics()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user goto the Computers \u0026 Accessories",
  "keyword": "When "
});
formatter.match({
  "location": "Electonics.user_goto_the_Computers_Accessories()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "goto the Datastorage",
  "keyword": "And "
});
formatter.match({
  "location": "Electonics.goto_the_Datastorage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "goto the USB Flash Drivers",
  "keyword": "And "
});
formatter.match({
  "location": "Electonics.goto_the_USB_Flash_Drivers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select the SanDisk brand",
  "keyword": "And "
});
formatter.match({
  "location": "Electonics.select_the_SanDisk_brand()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select the one USB from list",
  "keyword": "And "
});
formatter.match({
  "location": "Electonics.select_the_one_USB_from_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "product add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "Electonics.product_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "checkout the visiblity of cart page",
  "keyword": "Then "
});
formatter.match({
  "location": "Electonics.checkout_the_visiblity_of_cart_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To Purchase the USB Drive",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user login to fishpond oneD map",
  "rows": [
    {
      "cells": [
        "username",
        "mithranvivek91@gmail.com"
      ]
    },
    {
      "cells": [
        "password",
        "fish@12345"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Electonics.user_login_to_fishpond_oneD_map(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search the USB Drive oneD List",
  "rows": [
    {
      "cells": [
        "USB Drive"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Electonics.search_the_USB_Drive_oneD_List(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select the SanDisk brand",
  "keyword": "And "
});
formatter.match({
  "location": "Electonics.select_the_SanDisk_brand()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select the one USB from list",
  "keyword": "And "
});
formatter.match({
  "location": "Electonics.select_the_one_USB_from_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "product add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "Electonics.product_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "checkout the visiblity of cart page",
  "keyword": "Then "
});
formatter.match({
  "location": "Electonics.checkout_the_visiblity_of_cart_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "signout the account",
  "keyword": "And "
});
formatter.match({
  "location": "Electonics.signout_the_account()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});