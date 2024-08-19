package org.ExecutionPage;

import org.Manager.PageManager;
import org.global.BaseClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class TC03CustomerLogin extends BaseClass {
	public static BaseClass base = new BaseClass();
	public static PageManager pageManager = new PageManager();

	@Before
	public void validCustomerPage() {
		try {
			if (pageManager.getCustomerLogin().getCuslogin().isDisplayed()) {
				System.out.println("Manager_Entered_Customer's_LoginPage");
			} else {
				System.out.println();

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test
	public void customerLogin() {
		
		try {
			base.sleep(3000);
			WebElement cuslogin = pageManager.getCustomerLogin().getCuslogin();
			base.clickByJava(cuslogin);
			base.sleep(3000);
			
			WebElement yourname = pageManager.getCustomerLogin().getYourname();
			base.selectByText(yourname, "AjithKumar R");
			base.sleep(3000);
			
			WebElement login = pageManager.getCustomerLogin().getLogin();
			base.clickByJava(login);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
