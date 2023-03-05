package com.cydeo.step_definitions;

import com.cydeo.pages.BingSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Bing_StepDefinitions {

    BingSearchPage bingSearchPage = new BingSearchPage();
    @Given("user is on the Bing search page")
    public void user_is_on_the_bing_search_page() {
        Driver.getDriver().get("https://bing.com");


    }
    @When("User searches for orange")
    public void user_searches_for_orange() {
        bingSearchPage.searchBox.sendKeys("orange" + Keys.ENTER);


    }


    @Then("user should see orange - Search")
    public void userShouldSeeOrangeSearch() {
     WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
      wait.until(ExpectedConditions.titleIs("orange - Search"));
        BrowserUtils.verifyTitle("orange - Search");
    }

  /*  @When("user searches for tesla")
    public void userSearchesForTesla() {
        bingSearchPage.searchBox.sendKeys("tesla", Keys.ENTER);
    }

    @Then("user should see tesla - Search")
    public void userShouldSeeTeslaSearch() {
        BrowserUtils.verifyTitle("tesla - Search");
    }*/

    @When("User searches for {string}")
    public void userSearchesFor(String searchKey) {
    }

    @Then("User should see {string} - Search")
    public void userShouldSeeSearch(String expectedTitle) {
    }
}
