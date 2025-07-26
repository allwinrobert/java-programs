
public class togglecase {

	public static void main(String[] args) {
		String str=	"Hello";
        String toggle="";
		
	    for(int i=0;i<str.length();i++) {
	    	char ch=str.charAt(i);
	    	
	    	if(Character.isUpperCase(ch)) {
	    	   toggle+=Character.toLowerCase(ch);
	    	}
	    	else if(Character.isLowerCase(ch)){
	           toggle+=Character.toUpperCase(ch);
	    }
	}
	    System.out.println(toggle);
}
}
