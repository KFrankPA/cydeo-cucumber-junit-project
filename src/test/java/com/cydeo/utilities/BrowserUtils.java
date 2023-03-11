package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {

    // This class will be storing only the utility methods that can be used across the project

    public static void sleep(int seconds){
        seconds *= 1000;
        try {
            Thread.sleep(seconds);
        }catch (InterruptedException e){

        }
    }

    public static void switchWindowAndVerify(String expectedURL, String expectedTitle){

        Set<String> handles = Driver.getDriver().getWindowHandles();


        for (String eachHandle : handles) {
            Driver.getDriver().switchTo().window(eachHandle);
            String currentUrl = Driver.getDriver().getCurrentUrl();
            if(currentUrl.contains(expectedURL)){
                break;

            }

        }
        System.out.println(Driver.getDriver().getTitle());
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));

    }

    public static void verifyTitleContains(String expectedTitle){

        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));

    }
    public static void verifyTitle(String expectedTitle){

        Assert.assertEquals(Driver.getDriver().getTitle(),(expectedTitle));

    }

    public static void waitForInvisibilityOf(WebElement target){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        wait.until(ExpectedConditions.invisibilityOf(target));
    }
    /* This method accepts String title,
     and waits for that Title to contain given String value.
      */
    public static void waitForTitleContains(String title){
        //Create the object of 'WebDriverWait' class, and set up the constructor args
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        //use the 'wait' object with the proper syntax to create explicit wait conditions.
        wait.until(ExpectedConditions.titleContains(title));
    }

    /**
     * This method accepts a dropdown element and returns a List<String> that contains all options values as String.
     * @param dropdownElement
     * @return actualMonth_as_STRING
     */
        public static List<String> dropdownOptions_as_STRING(WebElement dropdownElement){

            Select month = new Select(dropdownElement);
            //Storing all the ACTUAL options into a List of WebElements
            List<WebElement> actualMonth_as_WEBELEMENT = month.getOptions();

            //Creating an EMPTY list of String to store ACTUAL <option> as String
            List<String> actualMonth_as_STRING = new ArrayList<>();

            //Looping through the List<WebElement>, getting all options' texts, and storing them into List<String>
            for (WebElement each : actualMonth_as_WEBELEMENT) {

                actualMonth_as_STRING.add(each.getText());

            }

            return actualMonth_as_STRING;

        }

    public static void clickRadioButton(List<WebElement> radioButtons, String attributeValue){
        for (WebElement each : radioButtons) {
            if(each.getAttribute("value").equalsIgnoreCase(attributeValue)){
                each.click();
            }
        }
    }

    }
