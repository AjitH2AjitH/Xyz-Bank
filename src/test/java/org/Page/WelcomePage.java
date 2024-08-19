package org.Page;

import org.global.BaseClass;
import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage extends BaseClass{
public WelcomePage() {
	PageFactory.initElements(driver, this);
}
@CacheLookup
@FindBy(how=How.XPATH,using="//button[@ng-class='btnClass2']")
private WebElement deposit;
public WebElement getDeposit() {
	return deposit;
}
@FindBy(how=How.XPATH,using="//input[@placeholder='amount']")
private WebElement amount;
public WebElement getAmount() {
	return amount;
}
@FindBy(how=How.XPATH,using="//button[@type='submit']")
private WebElement put;
public WebElement getPut() {
	return put;
}
@FindBy(how=How.XPATH,using="(//button[@class='btn btn-lg tab'])[2]")

private WebElement withdraw;
public WebElement getWithdraw() {
	return withdraw;
}
@FindBy(how=How.XPATH,using="//input[@placeholder='amount']")
private WebElement with;
public WebElement getWith() {
	return with;
}
@FindBy(how=How.XPATH,using="//button[@type='submit']")
private WebElement button;
public WebElement getButton() {
	return button;
}

}
