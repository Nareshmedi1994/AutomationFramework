package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzerPractice {
	
	@Test(retryAnalyzer = genericUtilities.RetryAnalyserImplementation.class)
	public void retryAnalyzer() {
		Assert.fail();
		System.out.println("hiii");
		
	}

}
