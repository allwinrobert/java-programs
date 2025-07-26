import java.util.*;
public class majorityelement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
        int value=0;
		for(int j=1;j<arr.length-1;j++) {
			if(arr[j]==arr[j+1]) {
				value=arr[j];
			System.out.println(arr[j]);
		}

	}

}
}
