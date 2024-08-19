package org.ExecutionPage;

import org.Manager.PageManager;
import org.global.BaseClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class TC04Welcome extends BaseClass {
	public static BaseClass base = new BaseClass();
	public static PageManager pageManager = new PageManager();

	@Test
	public void Deopsit() {
		try {
			base.sleep(5000);
			WebElement deposit = pageManager.getWelcomePage().getDeposit();
			base.clickByJS(deposit);
			base.sleep(8000);

			WebElement amount = pageManager.getWelcomePage().getAmount();
			base.sendKeysByJava(amount, base.readExcel(11, 1));
			base.sleep(9000);

			WebElement put = pageManager.getWelcomePage().getPut();
			base.clickByJava(put);
			base.sleep(8000);

			WebElement withdraw = pageManager.getWelcomePage().getWithdraw();
			base.clickByJS(withdraw);
			base.sleep(5000);

			WebElement with = pageManager.getWelcomePage().getWith();
			base.sendKeysByJava(with, "8000");
			base.sleep(5000);

			WebElement button = pageManager.getWelcomePage().getButton();
			base.clickByJava(button);
			base.sleep(5000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	

	@After
	public void welcomePage() {
		try {
			if (pageManager.getWelcomePage().getDeposit().isDisplayed()) {
				System.out.println("Entered_Deposit_Site");
				if (pageManager.getWelcomePage().getDeposit().isDisplayed()) {
					System.out.println("Entered_Withdraw_Page");
				}
			} else {

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	
	
	

}
