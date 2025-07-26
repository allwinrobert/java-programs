import java.util.Scanner;

public class numofdigits {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        int count =0;
	        if(n == 0) {
	        	System.out.println(1);
	        	
	        }
	        
	        while(n>0) { 
	        	n=n/10;
	        	count++;
	        	
	        	
	        }
	        System.out.println(count);
	}

}
