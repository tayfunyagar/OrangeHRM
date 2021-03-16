package com.orangeHRM.stepdefinitions;

import com.orangeHRM.base.ConfigReader;
import com.orangeHRM.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageSD {

    @Given("I am on login page")
    public void verifyTitle(){
        Assert.assertEquals("OrangeHRM",LoginPage.verifyTitle());
    }

    @When("I enter correct username in the username field")
    public void enterCorrectUsername() {
        LoginPage.enterUserName(ConfigReader.getProperty("username"));
    }

    @And("I enter correct password in the password field")
    public void enterCorrectPassword() {
        LoginPage.enterPassword(ConfigReader.getProperty("password"));
    }

    @And("I click on the login button")
    public void iClickOnTheLoginButton() {
        LoginPage.clickLogin();
        
    }

    @Then("I see the home page")
    public void iSeeTheHomePage() {
        Assert.assertEquals("Welcome Paul",LoginPage.getWelcomeMessage());
    }
}
