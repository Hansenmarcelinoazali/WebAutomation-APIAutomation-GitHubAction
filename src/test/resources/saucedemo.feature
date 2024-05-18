@login-Home-Cart-Logout
Feature:Login

  @Validstraightflow-Positive
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
    And user click option button
    And user click logout button



    @InvalidLogin-Negative
    Scenario: Login with invalid username and password
      Given user is on login page
      And user insert valid username with "standard_users"
      And user insert valid password with "secret_sauces"
      And user click login button
      Then user will get error "Epic sadface: Username and password do not match any user in this service"


#      @Boundaries-Test
#      Scenario: Input product to chart with value -1
#        Given user is on home page automation exercise
#        And the user clicks view product on the first product
#        And user click quantity and input "-1"
#        And user click button add to cart
#        Then user cannot add to cart
