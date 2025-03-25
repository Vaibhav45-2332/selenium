Feature: Online Shopping--Add Product to Cart & Checkout
Scenario: Add a product to the cart and proceed to checkout  
    Given  user is logged into the shopping website  
    And  user is on the product page  
    When  user adds a product to the cart  
    Then  product should be displayed in the cart  
    When  user proceeds to checkout  
    And selects a payment method  
    And confirms the order  
    Then  order should be placed successfully  
    And order successfully placed message will be displayed 
	