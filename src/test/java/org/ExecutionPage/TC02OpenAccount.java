package org.ExecutionPage;

import org.Manager.PageManager;
import org.global.BaseClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class TC02OpenAccount extends BaseClass {
	public static BaseClass base = new BaseClass();
	public static PageManager pageManager = new PageManager();

	@Before
	public void accountCreated() {
		try {
			if (pageManager.getOpenAccount().getOpenacc().isDisplayed()) {
				System.out.println("Successfully_Created_New_Account");
				if (pageManager.getOpenAccount().getCustomers().isDisplayed()) {
					System.out.println("Done_Validated_Customers_");
				}
			} else {

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test
	public void openAccount() {
		try {
			base.sleep(5000);
			WebElement openacc = pageManager.getOpenAccount().getOpenacc();
			base.clickByJava(openacc);
			base.sleep(5000);

			WebElement cusname = pageManager.getOpenAccount().getCusname();
			base.selectByText(cusname, "AjithKumar R");
			base.sleep(5000);

			WebElement currency = pageManager.getOpenAccount().getCurrency();
			base.selectByText(currency, "Rupee");
			base.sleep(5000);

			WebElement process = pageManager.getOpenAccount().getProcess();
			base.clickByJava(process);
			base.handleAlert();
			base.sleep(5000);
			
			WebElement customers = pageManager.getOpenAccount().getCustomers();
			base.clickByJava(customers);
			base.sleep(5000);
			
			WebElement home = pageManager.getOpenAccount().getHome();
			base.clickByJava(home);
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
