import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read the elements
        for (int i = 0; i < n;i++) {
        
            arr[i] = sc.nextInt();
        }
        int sum=0;
        int avg=0;
        for(int i=0;i<arr.length;i++) {
        	sum=sum+arr[i];
        	avg=sum/arr.length;
        } 
        System.out.println(avg);
   }
}


