import java.util.Scanner;

public class smallestelement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int min=n;
		
		for(int j=0;j<n;j++) {
			if(arr[j]<min){
			    min=arr[j];
				
			}

	}
		System.out.println(min);

}
}
