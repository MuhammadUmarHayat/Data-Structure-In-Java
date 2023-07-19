package Tests;


import junit.framework.TestCase;

public class JunitSqrTest extends TestCase {

	public void test() {
		int[] arr = {1,3,5,7,9};	
		String str = "9 7 5 3 1";
		
		assertEquals("ReverseArrayTest 1 failed !", str, ReverseArray.printReverseArray(arr));
		UnitTestingClass obj=new UnitTestingClass();
		String result=ReverseArray.printReverseArray(arr);
		//assertEquals(str, ReverseArray.printReverseArray(arr));
		System.out.println(result);
		
		int[] arr1 = {1};	
		String str1 = "1";		
		assertEquals("ReverseArrayTest 1 failed !", str1, ReverseArray.printReverseArray(arr1));
		
		
	}
}
