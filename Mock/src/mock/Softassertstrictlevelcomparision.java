package mock;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassertstrictlevelcomparision {
	@Test
	public void comparision()
	{
		String actualname="Mukesh";
		String expectedname="Mukesh";
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(actualname,expectedname);
		System.out.println("both are same");
		sf.assertAll();


	}
	@Test
	public void containscomparision()
	{
		String actualname="mukesh";
		String expectedname="kesh";
		SoftAssert sf1=new SoftAssert();
		sf1.assertTrue(actualname.contains(expectedname));
		System.out.println("partial name is present");
		sf1.assertAll();
				
	}

}
