package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionPractice {
	SoftAssert sa = new SoftAssert();
	@Test
	public void sample() {
		String a ="hii";
		System.out.println("step1");
		System.out.println("step2");
		sa.assertEquals(0, 1);
		System.out.println("step3");
		System.out.println("step4");
		sa.assertAll();
		
	}

}
