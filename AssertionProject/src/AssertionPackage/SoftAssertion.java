package AssertionPackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion 
{
	
//  System.out.println("  ");  "  "    "  " ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	 @   @	  _
	
	String ExpectedName ="Milind";
	String Actualname ="ilind";
	
	String data=null;
	
	boolean value=true;
	
	SoftAssert obj=new SoftAssert();
	@Test
	public void AssertionMethod()
	{
		
		
		//Soft Assertion
		
		obj.assertEquals(Actualname, ExpectedName, "Both String are  not same");// To check both String same or not.
		
		//obj.assertNotEquals(Actualname, ExpectedName, "Both String are same");// To check both string different or not.
		
		//obj.assertNull(data,"Data  is a not null"); // To  check  String  is null 
		
		//obj.assertNotNull(data,"Data is a  null"); // to  check  String  is a not  null
		
		//obj.assertTrue(value,"Value is a false");// To check value is true or not
		
		//obj.assertFalse(value,"To check Value is a true");// To check value is false or not	
	}
	
	@Test
	public void assertNotEquals()
	{
		obj.assertNotEquals(Actualname, ExpectedName, "Both String are same");// To check both string different or not.
		obj.assertAll();
	}
	
	
	@Test
	public void assertNull()
	{
		//Assert.fail();
		obj.assertNull(data,"Data  is a not null"); // To  check  String  is null 
		
	}
	
	
	@Test
	public void assertTrue()
	{
		obj.assertTrue(value,"Value is a false");// To check value is true or not
		obj.assertAll();
	}
	
	@Test
	public void assertFalse()
	{
		obj.assertFalse(value,"To check Value is a true");// To check value is false or not	
		obj.assertAll();
	}
	

	
	
	
	
	
	
	
}
