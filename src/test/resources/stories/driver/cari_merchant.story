Finding the merchant

Narrative:
In order to get the food
As a customer
I want to find the food by the merchant
					 
Scenario:  Show the list of merchants from the nearest merchant
Given a list of merchants : KFC, MCD, PHD
When the distances between the merchants and the customer location are : 2.0, 3.5, 1.2
Then the system should show the list of merchants : PHD, KFC, MCD