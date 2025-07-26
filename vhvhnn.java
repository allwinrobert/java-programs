import java.util.*;
public class vhvhnn {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int ab = a;
			int rem = 0;
			for(;a!=0;a/=10) {
				int d =a%10;
				rem=rem*10+d;
			}
			if(ab==rem) {
				System.out.println("palindrome");
		     }
			else {
				System.out.println("no");
			}
		}
}
