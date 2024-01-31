package group;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test2 {
	
	@BeforeMethod
	public void test()
	{
		System.out.println("before method completed");
	}
	@BeforeMethod
	public void test2()
	{
		System.err.println("after method completed");
	}
	@Test
	public void test5()
	{
		System.out.println("test5 completed");
	}
	
	@Test
	public void test6()
	{
		System.out.println("test6 completed");
	}

}
