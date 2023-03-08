package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class DataTableStepDef {

    @Then("user should see below list")
    public void user_should_see_below_list(List<String> fruitsAndVeggies) {
        System.out.println("fruitsAndVeggies = " + fruitsAndVeggies);
    }

    @Then("I Will share my favorites")
    public void iWillShareMyFavorites(List<String> listOfPets) {
        System.out.println("listOfPets = " + listOfPets);
    }
    @Then("officer is able to see any data he wants")
    public void officer_is_able_to_see_any_data_he_wants(Map<String, String> driverInfo) {
        System.out.println("driverInfo = " + driverInfo);
        System.out.println("driverInfo.get(\"name\") = " + driverInfo.get("name"));
        System.out.println("driverInfo.get(\"lastName\") = " + driverInfo.get("lastName"));
        System.out.println("driverInfo.size() = " + driverInfo.size());


    }

}
