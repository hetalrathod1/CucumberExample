Feature: login functionality
  Background: user is on homepage
  @login
  Scenario Outline: user should not be able to login successfully with  "<invalid credentials>"

    Given user click on loginpage
    When user enter  invalid "<emailid>" and/or "<password>"
    Then user should able to see"<error message>"

    Examples:
    | emailid          | password |        |error message|
    | hetal123@gmail.com  | hetal12345|     |Login was unsuccessful. Please correct the errors and try again.No customer account found|
    | hetal@gmail.com     | hetal12345 |    |Login was unsuccessful. Please correct the errors and try again.The credentials provided are incorrect|

    | hetal123@gmail.com  | hetal123 |      |Login was unsuccessful. Please correct the errors and try again.No customer account found|

    | hetal@gmail.com      |   |            |Login was unsuccessful. Please correct the errors and try again.The credentials provided are incorrect|

    |                    | hetal123 |        |Login was unsuccessful. Please correct the errors and try again.The credentials provided are incorrect|
    |                    |  hetal12345 |     |Login was unsuccessful. Please correct the errors and try again.The credentials provided are incorrect|
    |hetal123@gmail.com  |   |                |Login was unsuccessful. Please correct the errors and try again.No customer account found|
    |                    |   |               |Login was unsuccessful. Please correct the errors and try again.No customer account found|

