package com.Fishpond.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Fishpond.objectrepository.ElectronicsPage;
import com.Fishpond.resources.CommonActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Electonics extends CommonActions{
	
	CommonActions c = new CommonActions();
	ElectronicsPage e = new ElectronicsPage();
	
	@Given("User Goto the Categories of Electronics")
	public void user_Goto_the_Categories_of_Electronics() {
	   c.click(e.getCategories());
	   c.impliciWait();
	   c.elementSelect(e.getElectronics());
//	   c.click(e.getElectronics());
	}
	String input;
	@When("user login to fishpond oneD map")
	public void user_login_to_fishpond_oneD_map(DataTable datatable) {
	   c.impliciWait();
		c.elementSelect(e.getSignIn());
		c.impliciWait();
//		try {
//		driver.findElement(By.xpath("//div[@id='checkbox']")).click();
//		}catch (Exception e) {
//			System.out.println(e);
//		}
	  Map<String, String> data = datatable.asMap(String.class, String.class);
	  input = data.get("username");
	  c.insert(e.getUserName(), input);
	  input = data.get("password");
	  c.insertEnter(e.getPassWord(), input);
	}

	@When("search the USB Drive oneD List")
	public void search_the_USB_Drive_oneD_List(DataTable datatable) {
		List<String> data = datatable.asList(String.class);
		input = data.get(0);
	   c.insertEnter(e.getSearchBar(), input);
	}

	@When("user goto the Computers & Accessories")
	public void user_goto_the_Computers_Accessories() {
		c.impliciWait();
	   c.click(e.getElectronicsCategory());
	}

	@When("goto the Datastorage")
	public void goto_the_Datastorage() {
		c.impliciWait();
	   c.click(e.getAccessoriesCategory());
	}

	@When("goto the USB Flash Drivers")
	public void goto_the_USB_Flash_Drivers() {
		c.impliciWait();
	   c.click(e.getStorageCategory());
	}

	@When("select the SanDisk brand")
	public void select_the_SanDisk_brand() {
		c.impliciWait();
		WebElement element = driver.findElement(By.xpath("//input[@name='brand']//parent::div//parent::div[@class='refine-options__collection']//div[@class='b-refine__more']"));
		element.click();
	   c.click(e.getBrandCategory());
	}

	@When("select the one USB from list")
	public void select_the_one_USB_from_list() {
		c.impliciWait();
		c.click(e.getListView());
		 System.out.println(e.getProductSelect().getText());
	    c.click(e.getProductSelect());
	   
	}

	@When("product add to cart")
	public void product_add_to_cart() {
		c.impliciWait();
	   c.click(e.getCartButton());
	}

	@Then("checkout the visiblity of cart page")
	public void checkout_the_visiblity_of_cart_page() {
		c.impliciWait();
	   c.click(e.getHomeCartButton());
	   System.out.println(driver.findElement(By.xpath("//div[@class='product-details-container']//p")).getText());
	}
	
	@Then("signout the account")
	public void signout_the_account() {
	    c.elementSelect(e.getSignOut());
	}

}
