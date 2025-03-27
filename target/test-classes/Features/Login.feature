Feature: User Login

  @test
  Scenario Outline: Login with credentials
    Given The user is on the login page
    When The user enters <credentials> username "<username>" and password "<password>"
    And Clicks on the login button
    Then The user should see the <messageType> message  as "<loginMessage>"

    Examples:
      | username    | password  | credentials | messageType | loginMessage                 |
      | validUser   | validPass | valid      | success      | Welcome to the dashboard     |
      | invalidUser | validPass | invalid    | failure     | Invalid username or password |
      
      
 
 