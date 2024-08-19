package org.ExecutionPage;

import org.Manager.PageManager;
import org.global.BaseClass;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class TC01ManagerLogin extends BaseClass {
	public static BaseClass base = new BaseClass();
	public static PageManager pagemanager = new PageManager();

	@Before
	public void browserLaunch() {

		try {

			BaseClass base = new BaseClass();

			BaseClass.getDriver(base.readExcel(1, 1));
			base.sleep(2000);
			base.winMax();
			base.launchUrl(base.readExcel(3, 1));
			base.sleep(8000);
			if (pagemanager.getManagerLogin().getManager().isDisplayed()) {
				System.out.println("Successfully_Xyz-Bank_Site Logeed_In");
			} else {
				System.out.println("UserLogin_UnsucessFully");
			}


			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test
	public void managerLogin() {
		try {

			WebElement manager = pagemanager.getManagerLogin().getManager();
			base.clickByJS(manager);
			base.sleep(8000);

			WebElement addcus = pagemanager.getManagerLogin().getAddcus();
			base.clickByJava(addcus);
			base.sleep(3000);

			WebElement getfirstname = pagemanager.getManagerLogin().getfirstname();
			base.sendKeysByJava(getfirstname, base.readExcel(5, 1));

			WebElement lastname = pagemanager.getManagerLogin().getLastname();
			base.sendKeysByJava(lastname, base.readExcel(7, 1));

			WebElement post = pagemanager.getManagerLogin().getPost();
			base.sendKeysByJava(post, base.readExcel(9, 1));

			WebElement addman = pagemanager.getManagerLogin().getAddman();
			base.clickByJava(addman);
			base.handleAlert();
			base.sleep(5000);
			
			
			
			

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
