 Feature: Banking - Money Transfer Between Accounts
 
 Scenario Outline:Successfully transfer money between accouts
       Given user is logged into the banking application
       And navigates to the transfer money page
       When user selects accounts of both "<sender>" and "<reciver>"
       And enter valid "<amount>"
       Then confirms transaction
       Then specified amount should be deducted form sender's account
       And creadited to the reciver's account
       And  money transfer message should displayed

   Examples:
          
         |  sender  | reciver | amount| 
         |  sender1 | reciver1| amount|
         |  sender2 | reciver2| amount|
         |  sender3 | reciver3| amount|
	