import java.util.*;
public class Hello {
    public static void main(String[] args) {
		//Flipping Bits 32-Bit Format
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    int a=sc.nextInt();
		    System.out.println(Long.valueOf(mod(Integer.toBinaryString(a)),2)+"");
		}
	}
	public static String mod(String a){
	    int l=a.length();
	    String s="111111111111111111111111111111111";
	    String ans=s.substring(0,32-l);
	    for(char i:a.toCharArray()){
	        if(i=='1') ans+='0';
	        else ans+='1';
	    }
	    return ans;
	}
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Repeated & Missing Integer
		Scanner sc=new Scanner(System.in);
		int d=0;
		int s=0;
		int n=0;
		Set<Integer> a=new HashSet<>();
		while(sc.hasNext()){
		    int inp=sc.nextInt();
		    n=(n<inp)?inp:n;
		    
		    if(a.contains(inp)){ d=inp;}
		    else{ a.add(inp);s+=inp;}
		}
		
		int ans=((n)*((n+1))/2)-s;
		System.out.print(d+" "+ans);

	}
}
