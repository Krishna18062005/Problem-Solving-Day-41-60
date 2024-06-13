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
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Concatenate Four Matrices Pattern
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] ar=new int[n][n];
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        ar[i][j]=sc.nextInt();
		    }
		}
		for(int i=0;i<n*2;i++){
		    int id=(i<n)?i:i-n;
		    for(int j=0;j<n;j++){
		        if((id+j>=n&&i<n)||(id<j&&i>=n)){
		            System.out.print("* ");
		        }
		        else
		        System.out.print(ar[id][j]+" ");
		    }
		    for(int k=0;k<n;k++){
		        if((id>k&&i<n)||k+id<n-1&&i>=n){
		            System.out.print("* ");
		        }
		        else
		        System.out.print(ar[id][k]+" ");
		    }
		    System.out.println("");
		}
		

	}
}
