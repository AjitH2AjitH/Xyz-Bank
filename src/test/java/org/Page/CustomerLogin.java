package org.Page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CustomerLogin extends BaseClass {
	public CustomerLogin() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//button[@class='btn btn-primary btn-lg'])[1]")
	private WebElement cuslogin;

	public WebElement getCuslogin() {
		return cuslogin;
	}

	@FindBy(how = How.XPATH, using = "//select[@id='userSelect']")
	private WebElement yourname;

	public WebElement getYourname() {
		return yourname;
	}

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-default']")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

}
