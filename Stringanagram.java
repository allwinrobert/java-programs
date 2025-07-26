import java.util.Scanner;
public class Stringanagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		
		//for(int i=0;i<str.length();i++) {
			//char ch=str.charAt(i);
			
			if (str1.length()==str2.length()) {
				System.out.println("true");
			}
			 
			
			else {
				System.out.println("false");
			}
		}
		

	

}
