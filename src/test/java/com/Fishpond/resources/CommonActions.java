package com.Fishpond.resources;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CommonActions {
	
	public static WebDriver driver;
	
	public void launch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url); 
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public void insert(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public void insertEnter(WebElement element, String value) {
		element.sendKeys(value, Keys.ENTER);
	}
	
	public void getValue(WebElement element) {
		element.getText();
	}
	
	public void scrollView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	public void assertValidation(String value1,String value2) {
		
		Assert.assertEquals(value1, value2);
		
	}
	
	public void elementSelect(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
//		Actions a = new Actions(driver);
//		a.moveToElement(element);
//		a.click();
		
	}
	
	public void impliciWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	

}
