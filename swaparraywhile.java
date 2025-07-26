import java.util.Scanner;

public class swaparraywhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a  = sc.nextInt();
		int[] arr=new int[a];
	    for(int i=0;i<arr.length;i++){
	       arr[i]=sc.nextInt();
	    }
		int left=0;
		int right=arr.length-1;
		int temp=0;
		
		while(left<right) {
			temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;

		}
		for(int i :arr) {
			System.out.print(i+" ");
		}
	}
}
		
		
		
