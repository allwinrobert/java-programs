import java.util.*;
public class rotatearray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
	
		int temp=arr[0];
		
		for(int i=1;i<arr.length;i++) {
	    arr[i-1]=arr[i];
		}
		for(int j=1;j<arr.length;j++) {
		    arr[j-1]=arr[j];
	    
		}arr[arr.length-1]=temp;
	    
		for(int j=0;j<arr.length;j++) {
	
			System.out.println(arr[j]);
		}
		//System.out.println(arr);
	}
		
		
		
			
	
}
		
		




