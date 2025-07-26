import java.util.*;
public class swaparr {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a  = sc.nextInt();
		int[] arr = new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		
		int temp = 0;
		for(int i=0;i<a/2;i++) {
		 temp=arr[i];
		 arr[i]=arr[a-i-1];
		 arr[a-i-1]=temp;
	     }
		
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
