Finding nearest product based on merchant's location from my location

Narrative:
In order to get optimal delivery time
As a customer
I want to find the nearest product from my location

Scenario: Find the nearest product
Given a list of products : Sate Taichan 10 tusuk, Bibimbap 1 porsi, Gule Kambing 1 porsi
When The distances between the merchants and my location are : 0.5, 1, 1.5
Then The sistem should pick : Sate Taichan 10 tusuk

Scenario: Product not found
Given a list of products : Sate Markonah Sarijadi, Sate Dono Sariwangi, Sate Jono Cibabat
When I search: Sate Abdul Ciwaruga
And a list of products is null
Then The sistem should display : Product not found