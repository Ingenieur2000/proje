package com.demoblaze.pages;

import com.demoblaze.utulities.BrowserUtils;
import com.demoblaze.utulities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MemleketPage extends BasePage {
        @FindBy (css = "#customer_login .woocommerce-form-register h3")
        public WebElement ueyeOlHeader;

        @FindBy (id = "username")
        public WebElement usernameInputBox;

        @FindBy (id = "password")
        public WebElement passwordInputBox;

        @FindBy (id = "[name=\"login\"]")
        public WebElement submitButton;

        @FindBy (css = "nav h5")
        public WebElement accountHeader;

        public void clickTheElementWithText(String textOfElement){
                WebElement findElement= Driver.get().findElement(By.xpath("//a[.='"+textOfElement+"']"));
                BrowserUtils.waitForClickablility(findElement,7).click();
        }



}
