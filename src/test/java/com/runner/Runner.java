package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(features = "C:\\Users\\IbuRosy\\Ibrahim1\\Cucumber2\\src\\test\\java\\com\\feature",glue="com.stepdefinition",dryRun =false)
	public class Runner {
}
