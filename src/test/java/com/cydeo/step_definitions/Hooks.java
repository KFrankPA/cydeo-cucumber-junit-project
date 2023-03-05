package com.cydeo.step_definitions;

/*
In this class we will be able to create "pre" and "post" condition for all the SCENARIOS and even STEPS
 */

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    //import the @Before coming from io.cucumber.java
    @Before (order = 1)
    public void setupMethod(){
        System.out.println("--->>> @Before: Running before each scenario");

    }
    @Before(value = "@login", order = 2)
    public void login_scenario_before(){
        System.out.println("--->>> @Before: Running before each Login scenario");

    }
    @After
    public void teardownScenario(){
        System.out.println("---> @After: Running after each SCENARIO");
        Driver.closeDriver();
    }
    @BeforeStep
    public void setupStep(){
        System.out.println("---->@BeforeStep: Running before each step");

    }
    @AfterStep
    public void teardownStep(){

        System.out.println("@AfterStep: Running each after step");
    }

        }
