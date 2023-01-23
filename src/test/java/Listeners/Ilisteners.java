package Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Utilities_Package.Utilities;

public class Ilisteners extends Utilities implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		this.driver=((Utilities)result.getInstance()).driver;
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	
	
	
	
	
}
