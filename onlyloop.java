import java.util.*;

public class onlyloop {

	public static void main(String[] args) {
	
			
					Scanner sc = new Scanner(System.in);
					int a = sc.nextInt();
					int sum = 0;
					int rem=0;
					for(int i=a;i>0;i/=10) {
						rem=i%10;
						sum=sum+rem;
					}System.out.println(sum);
	}
}
