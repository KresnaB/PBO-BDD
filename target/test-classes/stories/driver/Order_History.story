Save a history of each purchase

Narrative:
In order to See a list of purchase history
As a Customer
I want to Save my purchase history

Scenario:  Save purchase history
Given List of orders : Sate Markonah Sarijadi 10 Tusuk, Baso Dono Sariwangi 1 porsi, Martabak Jono Cibabat 1 loyang
When Order are : Complete, incomplete, Complete
Then Save information : Sate Markonah Sarijadi 10 Tusuk, Martabak Jono Cibabat 1 loyang

Scenario:  See the history of my order
Given A List of orders history : Sate Markonah Sarijadi 10 Tusuk, Martabak Jono Cibabat 1 loyang
When I selected an order : true, false
Then Display selected order : Sate Markonah Sarijadi 10 Tusuk