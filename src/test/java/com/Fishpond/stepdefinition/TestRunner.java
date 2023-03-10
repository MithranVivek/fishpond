package com.Fishpond.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features",
					glue = "com.Fishpond.stepdefinition",
					plugin = {"html:target","json:target/reports.json"},
					monochrome = false,
					dryRun = false
					)
public class TestRunner {

}
