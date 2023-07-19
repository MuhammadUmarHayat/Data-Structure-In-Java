package UnitTesting;

import java.util.Arrays;

public class ReverseArray {
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
	  	
		
	}	
	

}
