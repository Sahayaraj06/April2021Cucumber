Feature: Amazon search

@Smoke
Scenario: Search a Product
Given I have a search field on amazon page
When I search for a product "Apple Macbook Pro" and price 1000
Then Product "Apple Macbook Pro" should be displayed
@Regression
Scenario: Search a Product Iphone
Given I have a search field on amazon page
When I search for a product "Ihone" and price 1000
Then Product "IPHONE" should be displayed