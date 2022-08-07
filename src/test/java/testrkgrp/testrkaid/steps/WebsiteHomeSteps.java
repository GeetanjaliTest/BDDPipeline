package testrkgrp.testrkaid.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import testrkgrp.testrkaid.common.BaseTest;
import testrkgrp.testrkaid.common.WebDriverInstance;
import testrkgrp.testrkaid.pages.WebHomePage;

import static testrkgrp.testrkaid.common.WebDriverInstance.driver;

public class WebsiteHomeSteps {
	WebHomePage home ;
	@Given("User open up the website")
	public void user_open_up_the_websites() {
	   	home = new WebHomePage();
	}

	@When("user clicks on Contact Us link")
	public void user_clicks_on_contact_us_link() {
		//home.verifyCartEmpty();
	}

	@Then("Contact Us page opens")
	public void contact_us_page_opens() {
		home.verifyCartEmpty();
	}
}
