package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DealerTrackHomePage;
import pages.GooglePage;
import pages.GoogleSearchesPage;

public class DealerTrackSearchSteps {
    GooglePage googlePage = new GooglePage();
    GoogleSearchesPage googleSearchesPage = new GoogleSearchesPage();
    DealerTrackHomePage dealerTrackHomePage = new DealerTrackHomePage();

    @Given("the user navigates to google.com.br")
    public void the_user_navigates_to_google_com_br() {
        googlePage.validateGoogleCharged();
    }

    @When("the user searches for Dealertrack Brasil")
    public void the_user_searches_for_Dealertrack_Brasil() {
        googlePage.sendSearchValue();
        googlePage.clickSearchButton();
        googleSearchesPage.validateSearchesCharged();
    }

    @When("the user clicks on the first link result")
    public void the_user_clicks_on_the_first_link_result() {
        googleSearchesPage.clickFirstResult();
    }

    @Then("the navigation displays the page www.dealertrack.com.br")
    public void the_navigation_displays_the_page_www_dealertrack_com_br() {
        dealerTrackHomePage.assertDealerTrackUrl();
    }

}
