package com.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogPage1 {
	
	@Given("Login to application")
	public void login_to_application() {
		System.out.println("browser");
	    
	}
	@When("enter username {string}")
	public void enter_username(String user) {
		System.out.println(user);
	   
	}
	@When("enter password {string}")
	public void enter_password(String pass) {
		System.out.println(pass);
	}
	@When("click login button")
	public void click_login_button() {
		System.out.println("click");
	}
	@Then("Validate the HomePage")
	public void validate_the_home_page() {
		System.out.println("completed");
	}


}
