package org.runner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;

public class ResultClass {
	public static void main(String[] args) {
		Result runClasses = JUnitCore.runClasses(TestRunner.class);
		 
		if (runClasses.wasSuccessful()) {
			System.out.println("****All Classes Executed Successfully****");
			
			int ignoreCount = runClasses.getIgnoreCount();
			System.out.println("Ignore Count"+ ignoreCount);
			
			int runCount = runClasses.getRunCount();
			System.out.println("Run count"+ runCount);
			
			long runTime = runClasses.getRunTime();
			System.out.println("Run Time in ms"+ runTime);
			
			
		} else {
			
		}

	}
	


}
