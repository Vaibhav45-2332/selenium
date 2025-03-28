 Feature: Banking - Money Transfer Between Accounts
 
 Scenario Outline:Successfully transfer money between accounts
       Given user is logged into the banking application
       And navigates to the transfer money page
       When user selects accounts of both "<sender>" and "<receiver>"
       And enter valid "<amount>"
       Then confirms transaction
       Then specified amount should be deducted form senders account
       And  credited to the receivers account
       And  money transfer message should displayed

   Examples:
          
         |  sender  | receiver | amount|
         |  sender1 | reciver1| amount|
         |  sender2 | reciver2| amount|

	