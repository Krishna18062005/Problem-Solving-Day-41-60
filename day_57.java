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
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Replace Words-K Characters
		Scanner sc=new Scanner(System.in);
		String w=sc.next();
		int k=sc.nextInt();
		sc.nextLine();
		String s=sc.nextLine();
		String ans="";
		String l=w.substring(0,k).toLowerCase();
		String ar[]=s.split(" ");
		for(String i:ar){
		    if(i.toLowerCase().startsWith(l)){
		        ans+=w+" ";
		    }
		    else
		    ans+=i+" ";
		}
		System.out.print(ans);

	}
}
