import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Sum -Remove K Zeroes
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++)
		{
		    ar[i]=sc.nextInt();
		    
		}
		long s=0;
		for(int i=0;i<n;i++){
		    if(k==0) s+=ar[i];
		    else{
		    long[] arr=removeZero(ar[i],k);
		    s+=arr[0];
		    k=(int)arr[1];}
		    
		}
		System.out.print(""+s);

	}
	public static long[] removeZero(int a,int b){
	    if(b==0){
	       long[] s={a,b};
	     return s;}
	    String bi=Integer.toBinaryString(a);
	   // System.out.println(bi+" "+b);
	    String ans="";
	    int z=0;
	    int i=0;
	    for(i=0;i<bi.length()&&z<b;i++){
	        
	        if(bi.charAt(i)=='1'){ ans+='1';
	           
	        }
	        else{
	            z++;
	        }
	        
	    }
	    ans+=bi.substring(i);
	    //System.out.println(ans+" "+b);
	    long an[]={Long.valueOf(ans,2),b-z};
	    return an;
	}
}
