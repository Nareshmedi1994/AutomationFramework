package genericUtilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * this class provides Implementation to IRetryAnalyser of TestNG
 */

public class RetryAnalyserImplementation implements IRetryAnalyzer  {

	
	int count =0;
	int retryCount = 3;// manual analysis
	public boolean retry(ITestResult result) {
		while(count<retryCount) {
			count++;
			return true;
		}
		return false;// not to retry
	}

}
