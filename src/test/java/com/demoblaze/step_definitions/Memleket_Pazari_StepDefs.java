package com.demoblaze.step_definitions;

import com.demoblaze.pages.LoginPage;
import com.demoblaze.pages.MemleketPage;
import com.demoblaze.utulities.ConfigurationReader;
import com.demoblaze.utulities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;
import java.util.Objects;

public class Memleket_Pazari_StepDefs {

    LoginPage loginPage=new LoginPage();
    MemleketPage memleketPage= new MemleketPage();

    @Given("I navigate to the memleket pazari home page")
    public void I_navigate_to_the_memleket_pazari_home_page() {
        Driver.get().get(ConfigurationReader.get("urlMemleketPazari"));
    }

    @When("I click on {string}")
    public void I_click_on(String kayitOl) {
        memleketPage.clickTheElementWithText(kayitOl);
    }

    @Then("I expect that {string} is displayed")
    public void I_expect_that_is_displayed(String expectedHeader) {
        String actualHeader = "";

        if (Objects.equals(expectedHeader, "Üye Ol")) {
            actualHeader = memleketPage.ueyeOlHeader.getText();
        } else if (Objects.equals(expectedHeader, "Hesabım")) {
            actualHeader = memleketPage.ueyeOlHeader.getText();
        }

        Assert.assertEquals("Header does NOT match",expectedHeader,actualHeader);
        System.out.println("expectedMessage = " + expectedHeader);
        System.out.println("actualMesage = " + actualHeader);
    }

    @When("I enter the {string} {string} input box")
    public void I_enter_the_input_box(String value, String inputBox) {
      if (Objects.equals(inputBox, "username")) {
          memleketPage.usernameInputBox.sendKeys(value);
      } else if (Objects.equals(inputBox, "password")) {
          memleketPage.passwordInputBox.sendKeys(value);
      }
    }

    @When("I click on the {string} button")
    public void I_click_on_the_button(String string) {
        memleketPage.submitButton.click();
    }
}
