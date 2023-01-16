
Feature: SwamLabs Testing

  @demo
  Scenario Outline: Login and checking functionality
    Given Launch the url
    Then Login using "<username>" and "<password>"
    # ProductPage
    And Verify the products page
    # ProductDetailPage
    When add a "<Product>" into cart
    # CartPage
    And goto the cart page and verify product details and checkout
#    CheckoutPage
    Then fill the form with "<FirstName>" "<LastName>" and "<ZipCode>" and continue
    And verify the checkout page and place the order
    And verify the successful message
    Examples:
    |   username    |  password    |     Product       |FirstName  | LastName | ZipCode |
    | standard_user | secret_sauce | Sauce Labs Onesie | Test      | Name     | 267364  |
    
   
    
    
