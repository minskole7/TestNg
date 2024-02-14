package seleniumPro;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners  implements ITestListener{
	
	  @Override
	    public void onTestStart(ITestResult result) {
	        System.out.println("Staring -----");
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        System.out.println("Ending -----");
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        System.out.println("Failed-------");
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        System.out.println("Skipped -------");
	    }



}
