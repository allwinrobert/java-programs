import java.util.*;
class main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr=new Int[a];
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<arr.length;i++) {
			temp=arr[i];
			arr[i]=arr[i-1];
			arr[i-1]=temp;
		}
	}
}