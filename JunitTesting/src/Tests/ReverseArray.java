package Tests;

public class ReverseArray {
	public static String printReverseArray(int[] arr)
	{
		String ret =  "";
		 for(int i=arr.length-1;i>=0;i--)
	         ret+=arr[i] +" ";
		 
		 // please fill your code here
			 return ret.trim();
	  	
		//return null; // remove this line after your implementation
		
	}	
	
}
