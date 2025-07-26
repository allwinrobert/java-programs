import java.util.*;
public class stringpallindrome {

	public static void main(String[] args) {
         String str="madam";
         String rev="";
         
         for(int i=str.length()-1;i>=0;i--){
        	 char ch=str.charAt(i);
        	 rev+=ch;
         }
         if(str.equals(rev)) {	 
        	 System.out.println("True");
         }else {
        	 System.out.println("False");
         }
    }
} 
	


