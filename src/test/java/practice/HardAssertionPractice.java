package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionPractice {
	
	@Test
	public void sample() {
		String a ="hi";
		System.out.println("step1");
		System.out.println("step2");
		System.out.println("step3");
		//Assert.assertEquals("a", "A");
		Assert.assertTrue(a.contains("i"));
		System.out.println("step4");
		System.out.println("step5");
	}

}
