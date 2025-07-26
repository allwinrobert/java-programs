import java.util.*;
public class pallindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int og=n;
		int rem=0;
		while(n>0) {
			    int sum = n % 10;
			    rem = rem * 10 + sum;
			    n = n/ 10;
		
			}
		if(og==rem) {
			System.out.println("yes");
		}
		else {
			System.out.println("not");
		}

	

}
}

