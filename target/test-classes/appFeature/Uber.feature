Feature: Uber Booking Feature

@Smoke
Scenario: Booking Cab
Given User wants to select a car "sedan" from uber app
When User selects the car "sedan" and pickup point as "Bangalore"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD
Then User not pays

@Regression
Scenario: Booking Cab
Given User wants to select a car "SUV" from uber app
When User selects the car "suv" and pickup point as "Chennai"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

@Prod
Scenario: Booking Cab
Given User wants to select a car "mini" from uber app
When User selects the car "mini" and pickup point as "pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD