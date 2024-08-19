package org.runner;


import org.ExecutionPage.TC01ManagerLogin;
import org.ExecutionPage.TC02OpenAccount;
import org.ExecutionPage.TC03CustomerLogin;
import org.ExecutionPage.TC04Welcome;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TC01ManagerLogin.class, TC02OpenAccount.class, TC03CustomerLogin.class, TC04Welcome.class})

public class TestRunner {

}
