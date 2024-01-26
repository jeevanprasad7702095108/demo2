
package mock;

import org.testng.annotations.Test;

public class Executeatestcasemorethanonetime {
	
	@Test(invocationCount=2)
	public void createuser()
	{
		System.out.println("user create");
	}
	
	@Test(invocationCount=1)
	public void modifyuser()
	{
		System.out.println("user modified");
	}
	@Test(invocationCount=1)
	public void deleteuser()
	{
		System.out.println("user deleted");
	}
	
	
	
	
	

}
