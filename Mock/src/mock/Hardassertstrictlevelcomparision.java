package mock;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassertstrictlevelcomparision {
	@Test

	public void comparision()
	{
		String actualname="Mukesh";
		String expectedname="mukesh";
		Assert.assertEquals(actualname,expectedname);
		System.out.println("both are same");
	}
	@Test
	public void containscomparision()
	{
		String actualname="mukesh";
		String expectedname="esh";
		Assert.assertTrue(actualname.contains(expectedname));
		System.out.println("partial name is present");
	}

}
