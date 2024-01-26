package mock;

import org.testng.annotations.Test;

public class Negativepriority {
	@Test(priority=-3)
	public void createuser()
	{
		System.out.println("user created");
	}
	@Test(priority=-2)
	public void login()
	{
		System.out.println("login done");
	}
	@Test(priority=-1)
	public void modifyuser()
	{
		System.out.println("user modified");
	}

}
