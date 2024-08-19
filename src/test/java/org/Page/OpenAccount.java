package org.Page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OpenAccount extends BaseClass {
	public OpenAccount() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//button[@class='btn btn-lg tab'])[1]")
	private WebElement openacc;

	public WebElement getOpenacc() {
		return openacc;
	}

	@FindBy(how = How.XPATH, using = "//select[@id='userSelect']")
	private WebElement cusname;

	public WebElement getCusname() {
		return cusname;
	}

	@FindBy(how = How.XPATH, using = "//select[@id='currency']")
	private WebElement currency;

	public WebElement getCurrency() {
		return currency;
	}

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private WebElement process;

	public WebElement getProcess() {
		return process;
	}

	@FindBy(how = How.XPATH, using = "//button[@ng-class='btnClass3']")
	private WebElement customers;

	public WebElement getCustomers() {
		return customers;
	}
	@FindBy(how=How.XPATH,using ="//button[@class='btn home']")
	private WebElement home;
	public WebElement getHome() {
		return home;
	}
	
	
	

}
