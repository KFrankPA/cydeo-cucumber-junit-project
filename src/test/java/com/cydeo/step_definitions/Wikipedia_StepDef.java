package com.cydeo.step_definitions;

import com.cydeo.pages.WikipediaPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wikipedia_StepDef {

    WikipediaPage wikipediaPage = new WikipediaPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://wikipedia.org");

    }

    @When("User types {string} in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box(String keyword) {
        wikipediaPage.searchBox.sendKeys(keyword);


    }

    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikipediaPage.searchButton.click();

    }

    @Then("User sees {string} is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title(String keyword) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(keyword));
    }

    @Then("User sees {string} is in the main header")
    public void user_sees_steve_jobs_is_in_the_main_header(String keyword) {
        Assert.assertTrue(wikipediaPage.wikiHeader.getText().contains(keyword));
    }

    @Then("User sees {string} is in the image header")
    public void user_sees_steve_jobs_is_in_the_image_header(String keyword) {
        Assert.assertTrue(wikipediaPage.imgHeader.getText().contains(keyword));

    }


}
