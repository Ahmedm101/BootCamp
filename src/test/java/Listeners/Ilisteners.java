package Listeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Utilities_Package.Utilities;


public class Ilisteners extends Utilities implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		this.driver=((Utilities)result.getInstance()).driver;
		successScreenshot();
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		this.driver=((Utilities)result.getInstance()).driver;
		try {
			failedScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		this.driver=((Utilities)result.getInstance()).driver;
		try {
			skippedScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
	
	
}
