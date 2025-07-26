import java.util.*;
class integertoarray {

	public static void main(String[] args) {
	   int[] arr = {1,2,3};
	   int rem;
	   int idx = 2;
	
	for(int num=354;num>0;num=num/10)		   
	{
		rem = num%10;
		arr[idx--] = rem;
	    
	}
		int i =0;
		System.out.print(arr[i++] + " ");
		System.out.print(arr[i++] + " ");
		System.out.print(arr[i++] + " ");
}
	}


