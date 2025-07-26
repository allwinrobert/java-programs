import java.util.*;
public class swapinwlp {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int[] arr = new int[a];
			int temp = 0;
			int left=0;
			int right =0;
			while(left<right) {
				temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right++;
				System.out.println(arr[left]);
			}
		}
}
