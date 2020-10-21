package com.vytrack.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefs {
    @When("the user navigate fleet tab then Vehicles module")
    public void the_user_navigate_fleet_tab_then_Vehicles_module() {
        System.out.println("the user navigate fleet tab then Vehicles module");
    }

    @Then("the title should be Vehicles")
    public void the_title_should_be_Vehicles() {
        System.out.println("the title should be Vehicles");
    }

    @When("the user navigate Marketing tab then Campaigns module")
    public void the_user_navigate_Marketing_tab_then_Campaigns_module() {
        System.out.println("the user navigate Marketing tab then Campaigns module");
    }

    @Then("the title should be Campaigns")
    public void the_title_should_be_Campaigns() {
        System.out.println("the title should be Campaigns");
    }

    @When("the user navigate Activities tab then Calendar Events module")
    public void the_user_navigate_Activities_tab_then_Calendar_Events_module() {
        System.out.println("the user navigate Activities tab then Calendar Events module");
    }

    @Then("the title should be Calendars")
    public void the_title_should_be_Calendars() {
        System.out.println("the title should be Calendars");
    }
}
