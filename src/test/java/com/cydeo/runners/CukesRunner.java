package com.cydeo.runners;

import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-reports.html",
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = false,
        tags = "@etsy",
        publish = true

)

public class CukesRunner {}


