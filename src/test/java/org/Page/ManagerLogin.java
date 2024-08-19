package org.Page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ManagerLogin extends BaseClass {
	public ManagerLogin() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//button[@class='btn btn-primary btn-lg'])[2]")
	private WebElement manager;

	public WebElement getManager() {
		return manager;
	}

	@FindBy(how = How.XPATH, using = "(//button[@class='btn btn-lg tab'])[1]")
	private WebElement Addcus;

	public WebElement getAddcus() {
		return Addcus;
	}

	@FindBy(how = How.XPATH, using = "//input[@placeholder='First Name']")
	private WebElement firstname;

	public WebElement getfirstname() {
		return firstname;
	}

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Last Name']")
	private WebElement lastname;

	public WebElement getLastname() {
		return lastname;
	}

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Post Code']")
	private WebElement post;

	public WebElement getPost() {
		return post;
	}

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-default']")
	private WebElement addman;

	public WebElement getAddman() {
		return addman;
	}

}
