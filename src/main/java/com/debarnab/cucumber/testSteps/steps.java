package com.debarnab.cucumber.testSteps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class steps {

    @When("^I open chrome$")
    public void i_open_chrome() throws Throwable {
        System.out.println("I open chrome");
    }

    @Then("^I navigate to the base Url$")
    public void i_navigate_to_the_base_Url() throws Throwable {
        System.out.println("I navigate to the base Url");
    }

    @Then("^I enter userName and Password$")
    public void i_enter_userName_and_Password() throws Throwable {
        System.out.println("I enter userName and Password");
    }

    @Then("^I click on Sigin Link$")
    public void i_click_on_Sigin_Link() throws Throwable {
        System.out.println("I click on Sigin Link");
    }



}
