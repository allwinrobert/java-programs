import java.util.*;
public class arrayleader {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
		
		for(int i=0;i<n;i++) {
		{
			    boolean value = true;
			    for (int j = i + 1; j < n; j++) {
			        if (arr[i] <= arr[j]) {
			            value = false;
			            break;
			        }
			    }
			    if (value==true) {
			        System.out.print(arr[i] + " ");
			    }
			}
		}
	}
}


