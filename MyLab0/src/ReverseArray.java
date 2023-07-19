
import java.util.Arrays;
public class ReverseArray {
	/**
	 * This function is to print a 1D array in Reversed oder
	 * @param arr - 1D array
	 * @return String - the reverse order of arr (numbers should be separated by single space)
	 */
	public static String printReverseArray(int[] arr)
	{
		int i=0;
		int size = arr.length;
		int j=size-1;
		int temp=0;
		
		 for(i=arr.length-1;i>=0;i--)
	         System.out.print(arr[i] + "  ");
		 String ret =Arrays.toString(arr) ;
		 // please fill your code here
		
		 
		 return ret.trim();
	  	
		//return null; // remove this line after your implementation
		
	}	
	

}
