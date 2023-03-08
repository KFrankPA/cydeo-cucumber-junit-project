package com.cydeo.step_definitions;

/*
In this class we will be able to create "pre" and "post" condition for all the SCENARIOS and even STEPS
 */

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //import the @Before coming from io.cucumber.java
    @Before (order = 1)
    public void setupMethod(){
       // System.out.println("--->>> @Before: Running before each scenario");

    }
    @Before(value = "@login", order = 2)
    public void login_scenario_before(){
        System.out.println("--->>> @Before: Running before each Login scenario");

    }
    @After
    public void teardownScenario(Scenario scenario){
        if(scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

    //    System.out.println("---> @After: Running after each SCENARIO");
        Driver.closeDriver();
    }
    @BeforeStep(value = "@login")
    public void setupStep(){
       // System.out.println("---->@BeforeStep: Running before each step");

    }
    @AfterStep (value = "@login")
    public void teardownStep(){

      //  System.out.println("@AfterStep: Running each after step");
    }

        }
