package mock;

import org.testng.annotations.Test;

public class Noexecution {
	@Test
	public void createuser()
	{
		System.out.println("user created");
	}
	@Test
	public void modifyuser()
	{
		System.out.println("user modified");
	}
	@	Test(enabled=false)
	public void deleteuser()
	{
		System.out.println("user deleted");
	}

}
