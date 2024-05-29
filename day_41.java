import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Integer -Concatenate Bits in Reverse
		Scanner sc=new Scanner(System.in);
		int fn=sc.nextInt();
		int sn=sc.nextInt();
		StringBuilder first=new StringBuilder(Integer.toBinaryString(fn));
		StringBuilder second=new StringBuilder(Integer.toBinaryString(sn));
		first=first.reverse();
		second=second.reverse();
		String ans="";
		int n=Math.max(first.length(),second.length());
		for(int i=0;i<n;i++){
		    if(first.length()>i){
		        ans+=first.charAt(i);
		    }
		    if(second.length()>i){
		        ans+=second.charAt(i);
		    }
		}
		System.out.print(Integer.parseInt(ans,2));

	}
}
