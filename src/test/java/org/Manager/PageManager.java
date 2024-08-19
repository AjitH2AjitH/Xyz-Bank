package org.Manager;

import org.Page.CustomerLogin;
import org.Page.ManagerLogin;
import org.Page.OpenAccount;
import org.Page.WelcomePage;

public class PageManager {
	private ManagerLogin managerLogin;
	private OpenAccount openAccount;
	private CustomerLogin customerLogin;
	private WelcomePage welcomePage;
	
	
	public ManagerLogin getManagerLogin() {
		return (managerLogin==null)?managerLogin =new ManagerLogin(): managerLogin;
	}
	public OpenAccount getOpenAccount() {
		return (openAccount==null)?openAccount =new OpenAccount():openAccount;
	}
	public CustomerLogin getCustomerLogin() {
		return (customerLogin==null)?customerLogin= new CustomerLogin():customerLogin;
	}
	public WelcomePage getWelcomePage() {
		return(welcomePage==null)?welcomePage=new WelcomePage():  welcomePage;
	}
	
	
	

}
