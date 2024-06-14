import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//String Stairs Pattern
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
        String hi="";
        for(int i=0;i<n;i++){
            hi+='-';
        }
    
		for(int i=0;i<n;i++){
		    System.out.println(hi.substring(0,n-i-1)+s.substring(0,i+1));
		}
		for(int i=0;i<n;i++){
		    System.out.println(s.substring(i));
		}

	}
}
