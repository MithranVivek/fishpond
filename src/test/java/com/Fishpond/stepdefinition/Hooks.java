package com.Fishpond.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

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
	public void afterScenario() throws IOException {
		TakesScreenshot tk = (TakesScreenshot)driver;
		File loc = new File("C:\\Users\\Windows\\eclipse-vivek\\Fishpond\\target");
		File scr = tk.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(loc, scr);
		driver.quit();
	}

}
