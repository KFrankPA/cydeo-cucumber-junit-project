package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wikipedia {

    public Wikipedia(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//input[@name='search']")
    public WebElement searchBox;

     @FindBy (xpath = "//i[@class='sprite svg-search-icon']")
    public WebElement searchButton;

     @FindBy(xpath = "//span[@class='mw-page-title-main']")
    public WebElement wikiHeader;

     @FindBy (xpath = "//th[@class='infobox-above']//ancestor::div[@class='fn']")
    public WebElement imgHeader;
}
