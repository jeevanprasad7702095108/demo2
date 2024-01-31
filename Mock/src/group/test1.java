package group;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {
	
	@AfterClass
	public void test3()
	{
		System.out.println("before class completed");
	}
	
	@AfterClass
	public void test4()
	{
		System.out.println("after class completed");
	}
	
	@BeforeMethod
	public void test()
	{
		System.out.println("before method completed");
	}
	
	@AfterMethod
	public void test2()
	{
		System.out.println("after method completed");
	}
	
	@Test
	public void task1()
	{
		System.out.println("task1 completed");
	}
	
	@Test
	public void task2()
	{
		System.out.println("task2 completed");
	}
}
