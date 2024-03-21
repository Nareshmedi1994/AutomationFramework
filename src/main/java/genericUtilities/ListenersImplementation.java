package genericUtilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * THIS class provides implementation to ITestListener of TestNG
 * @author NARESH MEDI
 */

public class ListenersImplementation implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		System.out.println(methodname+"----Test Execution Started----");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		System.out.println(methodname+"----Test Execution pass----");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		    String methodname = result.getMethod().getMethodName();
			System.out.println(methodname+"----Test Execution fail----");
			SeleniumFileUtility s = new SeleniumFileUtility();
			JavaUtility j = new JavaUtility();
			String screenshotname = methodname+"-"+j.getDate();
			try {
				s.CaptureScreenshot(BaseClass.sdriver, screenshotname);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
			String methodname = result.getMethod().getMethodName();
			System.out.println(methodname+"----Test Execution skipped----");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("---Suite Execution started----");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("---Suite Execution finished----");
	}
	
	

}
