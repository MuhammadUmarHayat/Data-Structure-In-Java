import junit.framework.TestCase;

public class ReverseArrayTest extends TestCase 
{
	
	//@Test
	public void testPrintReverse1() {
		int[] arr = {1};	
		String str = "1";		
		assertEquals("ReverseArrayTest 1 failed !", str, ReverseArray.printReverseArray(arr));
		
	}
	
	//@Test
	public void testPrintReverse2() 
	{
		int[] arr = {1,3,5,7,9};	
		String str = "97531";
		assertEquals("ReverseArrayTest  2 failed !", str, ReverseArray.printReverseArray(arr));
	}

}
