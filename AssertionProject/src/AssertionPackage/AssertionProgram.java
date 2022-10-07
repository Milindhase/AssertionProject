package AssertionPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionProgram 
{
	 //  System.out.println("  ");  "  "    "  " ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	 @   @	  _
	
	String ExpectedName ="Milind";
	String Actualname ="ilind";
	
	String data=null;
	
	boolean value=true;
	
	@Test
	public void AssertionMethod()
	{
		//Hard Assertion
		
		Assert.assertEquals(Actualname, ExpectedName, "Both String are  not same");// To check both String same or not.
		
		Assert.assertNotEquals(Actualname, ExpectedName, "Both String are same");// To check both string different or not.
		
	   Assert.assertNull(data,"Data  is a not null"); // To  check  String  is null 
		
		Assert.assertNotNull(data,"Data is a  null"); // to  check  String  is a not  null
		
		Assert.assertTrue(value,"Value is a false");// To check value is true or not
		
		Assert.assertFalse(value,"To check Value is a true");// To check value is false or not		
	}		
}
