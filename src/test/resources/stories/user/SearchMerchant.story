Search merchant quickly and efficiently to buy products

Narrative:
In order to buy products
As a customer
I want to search the merchant
					 
Scenario: Merchant not found
Given a list of merchants: RM Padang Sari Bunda, Bumbu Desa, HokBen
When I search merchant: Bintang Kebab
And a list of products is null 
Then the system should display : No sign of merchant