package stepDefinitions;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Goibibo;


public class StepsforGoibibo {
    WebDriver dr;
    Goibibo gobj;
    
    public StepsforGoibibo() {
        dr=HooksGoibibo.dr;
    }

    @Given("User is on the homepage of given website")
    public void user_is_on_the_homepage_of_given_website() {
        gobj = new Goibibo(dr);
        gobj.homePage();
        gobj.verifyTitle();

    }

 

    @Given("make sure Round-trip is selected")
    public void make_sure_round_trip_is_selected() {
        gobj = new Goibibo(dr);
        gobj.tripType();

    }

 

    @When("user fills From & To locations")
    public void user_fills_from_to_locations() {
        gobj = new Goibibo(dr);
        gobj.fromtoLocations("Bengaluru", "Chennai");

    }

 

    @When("choose Departure date")
    public void choose_departure_date() {
        gobj = new Goibibo(dr);
        gobj.departureDate("April 2023", "4");

    }

    @When("return data")
    public void return_data() {
        // Write code here that turns the phrase above into concrete actions
        gobj = new Goibibo(dr);
        gobj.returnDate("6");

    }

    @Then("select Travellers & Class")
    public void select_travellers_class() {
        gobj = new Goibibo(dr);
        gobj.travellersClass();

    }

    @Then("select a Fare type")
    public void select_a_fare_type() {
        gobj = new Goibibo(dr);
        gobj.fareTypeCheck();

    }

    @When("User clicks on Search Flights")
    public void user_clicks_on_search_flights() {
        gobj = new Goibibo(dr);
        gobj.searchFlights();

    }

    // from here there is no access for automation
    @When("choose the flight with cheapest price for Departure date")
    public void choose_the_flight_with_cheapest_price_for_departure_date() {
        // Write code here that turns the phrase above into concrete actions
       gobj = new Goibibo(dr);

    }

 

    @When("choose the flight with cheapest price for Return  date")
    public void choose_the_flight_with_cheapest_price_for_return_date() {
        // Write code here that turns the phrase above into concrete actions

    }

 

    @Then("click on Book")

    public void click_on_book() {

        // Write code here that turns the phrase above into concrete actions


    }

 

    @Then("Review the Depature Fare Details")

    public void review_the_depature_fare_details() {

        // Write code here that turns the phrase above into concrete actions


    }

 

    @Then("Review the Return Fare Details")

    public void review_the_return_fare_details() {

        // Write code here that turns the phrase above into concrete actions


    }

 

}
