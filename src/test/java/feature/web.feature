Feature:Test Automation WEB On https://www.demoblaze.com/

  @web
  Scenario: Sign up with new username and password
    Given the user is on the home page
    And user clicks the sign up button
    And user enters username dynamic
    And  user enters  password "Pass_123456"
    When user click the sign up button
    Then user will receive a message popup "Sign up successful."

  @web
  Scenario:Sign up with missing required fields
    Given the user is on the home page
    Then the is on the sign up page
    When the user clicks the sign up button without entering username and password
    Then the user should see an error message "Please fill out Username and Password."

  @web
  Scenario: Login with a invalid registered account
    Given the user is on the home page
    And user clicks on the login menu in the navbar
    And user enters username "Mian Agave" on login page
    And  user enters password "emptypass123" on login page
    When user click the login button
    Then user will receive a message popup "Wrong password."


  @web
  Scenario: Login with a valid registered account
    Given the user is on the home page
    And user clicks on the login menu in the navbar
    And user enters username "Mian Agave" on login page
    And  user enters password "one" on login page
    When user click the login button
    Then the user should see a welcome message "Welcome Mian Agave"

  @web
  Scenario: user successfully checkout item
    Given the user is on the home page
    Then user select product "Samsung galaxy s6"
    Then user clicks add to cart button
    Then user accepts product added popup
    When user clicks label cart
    When user click Place order button
    Then user will be directed to fill out the following data form
      | Name    | Mian Agave       |
      | Country | Korea            |
      | City    | Seoul            |
      | Card    | 1234567890123456 |
      | Month   | 05               |
      | Year    | 2025             |
    Then user click Purchase button
    Then user should see success message "Thank you for your purchase!"

  @web
  Scenario: Logout user
    Given the users is logged in
    When the user clicks the log out button in the navbar
    Then the user should be redirected to home page
