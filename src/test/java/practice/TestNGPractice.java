package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGPractice {

	@Test
	public void CreateCustomer() {
		//Assert.fail();
		System.out.println("create");
	}
	@Test(dependsOnGroups = "CreateCustomer")
	public void modifyCustomer() {
		System.out.println("modify");
	}
	@Test(priority = 0)
	public void deleteCustomer() {
		System.out.println("delete");
		//default order of Execution is ASCII value
	}
	@Test(invocationCount = 2)
	public void editcustomer() {
		System.out.println("edit");
	}
	@Test(enabled = false)
	public void viewCustomer() {
		System.out.println("edit");
	}
}
