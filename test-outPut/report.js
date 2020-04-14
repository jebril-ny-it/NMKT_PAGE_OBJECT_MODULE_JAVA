$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FriendsList.feature");
formatter.feature({
  "line": 1,
  "name": "Social Activities",
  "description": "in order to make connecton with all my friends in socialware website\nAs a logged in user\ni want to check my friends adding removing list if them",
  "id": "social-activities",
  "keyword": "Feature"
});
formatter.before({
  "duration": 117472,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Friends list has atleast one friends available",
  "description": "",
  "id": "social-activities;friends-list-has-atleast-one-friends-available",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I open browser chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I navigate to socialware.com",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I complete login with valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I expects atleast one friend available",
  "keyword": "Then "
});
formatter.match({
  "location": "login_steps.I_open_browser_chrome()"
});
formatter.result({
  "duration": 2015460247,
  "status": "passed"
});
formatter.match({
  "location": "login_steps.I_navigate_to_socialware_com()"
});
formatter.result({
  "duration": 1557117840,
  "status": "passed"
});
formatter.match({
  "location": "login_steps.i_complete_login_with_valid_credentials()"
});
formatter.result({
  "duration": 1829142777,
  "status": "passed"
});
formatter.match({
  "location": "login_steps.i_expects_atleast_one_friend_available()"
});
formatter.result({
  "duration": 24249724,
  "error_message": "org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression //h3[contains(text(),\u0027Friends\u0027)]//a[@class\u003d\u0027pull-right\u0027][contains(text(),\u0027More\u0027]) because of the following error:\nSyntaxError: Failed to execute \u0027evaluate\u0027 on \u0027Document\u0027: The string \u0027//h3[contains(text(),\u0027Friends\u0027)]//a[@class\u003d\u0027pull-right\u0027][contains(text(),\u0027More\u0027])\u0027 is not a valid XPath expression.\n  (Session info: chrome\u003d80.0.3987.149)\n  (Driver info: chromedriver\u003d80.0.3987.106 (f68069574609230cf9b635cd784cfb1bf81bb53a-refs/branch-heads/3987@{#882}),platform\u003dMac OS X 10.15.2 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 22 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00272.41.0\u0027, revision: \u00273192d8a6c4449dc285928ba024779344f5423c58\u0027, time: \u00272014-03-27 11:29:39\u0027\nSystem info: host: \u0027mohammads-MBP.home\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.2\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dMAC, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:63027}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003dignore, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d80.0.3987.106 (f68069574609230cf9b635cd784cfb1bf81bb53a-refs/branch-heads/3987@{#882}), userDataDir\u003d/var/folders/yk/lxkgfq3x1pb1dphy108mbphm0000gn/T/.com.google.Chrome.O17e5Q}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d80.0.3987.149, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 9b15e3e9b2f819888d0a4940ca92ade7\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:193)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:145)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:595)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:348)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:445)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:357)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:340)\n\tat nmktpages.MasterPage.clickElement(MasterPage.java:39)\n\tat nmktpages.HomePage.moveToFriendPage(HomePage.java:58)\n\tat nmktstepsdefination.login_steps.i_expects_atleast_one_friend_available(login_steps.java:72)\n\tat ✽.Then I expects atleast one friend available(FriendsList.feature:10)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 596534449,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "NMKT NYC Online Login",
  "description": "As a user of NMKTNYC i can login to online store \nSO i can do all logged in activities.",
  "id": "nmkt-nyc-online-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 60302,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Successfull Login",
  "description": "",
  "id": "nmkt-nyc-online-login;successfull-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I open browser chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I navigate to socialware.com",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I complete login with valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I expect profile name as James Mathew",
  "keyword": "Then "
});
formatter.match({
  "location": "login_steps.I_open_browser_chrome()"
});
formatter.result({
  "duration": 1238102758,
  "status": "passed"
});
formatter.match({
  "location": "login_steps.I_navigate_to_socialware_com()"
});
formatter.result({
  "duration": 3592286000,
  "status": "passed"
});
formatter.match({
  "location": "login_steps.i_complete_login_with_valid_credentials()"
});
formatter.result({
  "duration": 2827463345,
  "status": "passed"
});
formatter.match({
  "location": "login_steps.i_expect_profile_name_as_James_Mathew()"
});
formatter.result({
  "duration": 2033974814,
  "status": "passed"
});
formatter.after({
  "duration": 96226722,
  "status": "passed"
});
formatter.uri("SocialActivites.feature");
formatter.feature({
  "line": 1,
  "name": "Social Activities",
  "description": "In order to preforem social operation in socialWare \nas a logged in user\ni want to check that i can do post comment like ETCS",
  "id": "social-activities",
  "keyword": "Feature"
});
formatter.before({
  "duration": 49708,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Successful post of a status",
  "description": "",
  "id": "social-activities;successful-post-of-a-status",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I open browser chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I navigate to socialware.com",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I complete login with valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I expect profile name as James Mathew",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I can create \u0026 submit a post",
  "keyword": "And "
});
formatter.match({
  "location": "login_steps.I_open_browser_chrome()"
});
formatter.result({
  "duration": 1539156935,
  "status": "passed"
});
formatter.match({
  "location": "login_steps.I_navigate_to_socialware_com()"
});
formatter.result({
  "duration": 21723351324,
  "status": "passed"
});
formatter.match({
  "location": "login_steps.i_complete_login_with_valid_credentials()"
});
formatter.result({
  "duration": 2619254865,
  "status": "passed"
});
formatter.match({
  "location": "login_steps.i_expect_profile_name_as_James_Mathew()"
});
formatter.result({
  "duration": 2027872680,
  "status": "passed"
});
formatter.match({
  "location": "login_steps.i_can_create_submit_a_post()"
});
formatter.result({
  "duration": 6212477571,
  "status": "passed"
});
formatter.after({
  "duration": 96905628,
  "status": "passed"
});
});