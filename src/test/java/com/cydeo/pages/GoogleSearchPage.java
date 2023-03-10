package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Create the constructor and initialize the driver with object
    // use @FindBy instead of findElement

    @FindBy (xpath = "//input[@name='q']")
    public WebElement searchBox;
}
