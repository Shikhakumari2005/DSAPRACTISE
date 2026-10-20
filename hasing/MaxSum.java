/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static int MaxSum(int[] arr){
		HashMap<Integer,Integer> m=new HashMap<>();
		int max=0;
		for(int i=0;i<arr.length;i++){
			int rem =arr[i]%10;
			int quot=arr[i]/10;
			int sum =rem+quot;
			if(m.containsKey(sum)){
				int ans=m.get(sum)+arr[i];
				max=Math.max(ans,max);
			}else{
				m.put(sum,arr[i]);
			}
		}
		return max;
	}
	public static void main (String[] args) 
	
	{
		// your code goes here
		int[] arr={42,6,33};
		System.out.print(MaxSum(arr));
	}
}
