import java.util.Scanner;

public class countevennuminarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count =0;
        
        for (int i = 0; i < n;i++) {
            
            arr[i] = sc.nextInt();
        }
       
        while(n == n+1 &&  n%2==0 ) {
        	count++;
      
        
	        System.out.print(count);
        }

	}
}


