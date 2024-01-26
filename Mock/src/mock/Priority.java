package mock;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority=1)
	public void createuser()
	{
		System.out.println("user create");
	}
	@Test(priority=2)
	public void login()
	{
		System.out.println("login done");
	}
	@Test(priority=3)
	public void modifyuser()
	{
		System.out.println("user modified");
	}
	@Test(priority=4)
	public void logout()
	{
		System.out.println("logout");
	}
	@Test(priority=5)
	public void deleteuser()
	{
		System.out.println("user delete");
	}
	
		
	

}
