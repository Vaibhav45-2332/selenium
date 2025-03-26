 Feature: User Login  

  Scenario Outline: Login with credentials  
    Given the user is on the login page  
    When the user enters username "<username>" and password "<password>"  
    And clicks on the login button  
    Then the user should see "<message>"  

    Examples:  
      | username   | password  | message                      |  
      | validUser  | validPass | Welcome to the dashboard     |  
      | invalidUser| validPass | Invalid username or password |  
      
      
 
 