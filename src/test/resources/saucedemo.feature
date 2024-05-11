@login-Home-Cart-Logout
Feature:Login

  @Validstraightflow
  Scenario: Login with valid username and password, insert one product to cart, klik option and logout
    Given user is on login page
    And user insert valid username with "standard_user"
    And user insert valid password with "secret_sauce"
    And user click login button
    Then user is on homepage and see product "Sauce Labs Backpack"
    And user click add to cart button for "Sauce Labs Backpack"
    Then chart button should display "1"
    And user clik cart button
    Then user see the product which was recently added "Sauce Labs Backpack"
#    And user click option button
#    And user click logout button
