package com.Fishpond.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Fishpond.resources.CommonActions;

public class ElectronicsPage extends CommonActions{
	
	public ElectronicsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@id='menu-mobile']//span[text()='Categories']")
	private WebElement categories;
	
	@FindBy(xpath = "(//a[text()='Electronics'])[2]")
	private WebElement electronics;
	
	@FindBy(xpath = "(//a[contains(text(),'Computers')])[1]")
	private WebElement electronicsCategory;

	@FindBy(xpath = "(//a[text()='Data Storage'])[1]")
	private WebElement accessoriesCategory;
	
	@FindBy(xpath = "(//a[text()='USB Flash Drives'])[1]")
	private WebElement storageCategory;
	
	@FindBy(xpath = "(//div[@class='b-refine__master']//a[text()='SanDisk'])[1]")
	private WebElement brandCategory;
	
	@FindBy(xpath = "//a[@class='item-block__title-link']")
	private WebElement productSelect;
	
	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement cartButton;
	
	@FindBy(xpath = "//li[@class='menu__item ']")
	private WebElement homeCartButton;
	
	@FindBy(xpath = "(//div[@style='float: right;'])[4]")
	private WebElement listView;
	
	@FindBy(xpath = "//li[contains(@class,'item_account')]//a")
	private WebElement signIn;
	
	@FindBy(xpath = "//input[@id='email_address']")
	private WebElement userName;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passWord;
	
	@FindBy(id = "searchbar")
	private WebElement searchBar;
	
	public WebElement getSearchBar() {
		return searchBar;
	}

	@FindBy(xpath = "//span[text()='Sign In']")
	private WebElement signinButton;
	
	@FindBy(xpath = "//li[@class='menu__item']//a[text()='Sign out']")
	private WebElement signOut;
	
	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getSigninButton() {
		return signinButton;
	}

	public WebElement getSignOut() {
		return signOut;
	}

	public WebElement getHomeCartButton() {
		return homeCartButton;
	}

	public WebElement getListView() {
		return listView;
	}

	public WebElement getCartButton() {
		return cartButton;
	}

	public WebElement getCategories() {
		return categories;
	}

	public WebElement getElectronics() {
		return electronics;
	}

	public WebElement getElectronicsCategory() {
		return electronicsCategory;
	}

	public WebElement getAccessoriesCategory() {
		return accessoriesCategory;
	}

	public WebElement getStorageCategory() {
		return storageCategory;
	}

	public WebElement getBrandCategory() {
		return brandCategory;
	}

	public WebElement getProductSelect() {
		return productSelect;
	}

}
