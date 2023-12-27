Feature: To book flight tickets in Goibibo website
    @First
  Scenario: Lauching the Goibibo Website & Choosing the From, To Locations
    Given User is on the homepage of given website
    And make sure Round-trip is selected
    When user fills From & To locations
    And choose Departure date
    And return data
    Then select Travellers & Class
    And select a Fare type

  @Second 
  Scenario: Searching and Booking the filght according to customer specifications
    When User clicks on Search Flights
    And choose the flight with cheapest price for Departure date
    And choose the flight with cheapest price for Return  date
    Then click on Book
    Then Review the Depature Fare Details
    And Review the Return Fare Details



 