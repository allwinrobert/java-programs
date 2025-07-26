import java.util.Scanner;

public class forloopsumofthearray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int sum=0;	
	    for(int j=0;j<n;j++) {
	    	arr[j]=sc.nextInt();
	    	sum=sum+arr[j];
	    } System.out.print(sum);
	}

}

