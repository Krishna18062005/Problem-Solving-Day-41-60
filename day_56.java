import java.util.*;
public class Hello {

    public static void main(String[] args) {
	//Integer-Count of Even Integers
	Scanner sc=new Scanner(System.in);
	int ip=sc.nextInt();
	String in=String.valueOf(ip);
	int c=0;
	int n=in.length();
	for(int i=0;i<n;i++){
	    for(int j=i;j<n;j++){
	        int val=0;
	        String v=(in.substring(i,j+1));
	        if(v.startsWith("0")) continue;
	        else
	        val=Integer.parseInt(v);

	        if(val%2==0&&val!=0){
	            c+=1;
	        }
	    }
	}
	System.out.print(c);

	}
}
