package com.Fishpond.stepdefinition;

import com.Fishpond.resources.CommonActions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonActions{
	
	CommonActions c = new CommonActions();
	
	@Before
	public void beforeScenario() {
		c.launch("https://www.fishpond.com/");
	}
	
	@After
	public void afterScenario() {
		driver.quit();
	}

}
