import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Twice & reverse;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=0;i<b;i++){
		    for(int j=0;j<a;j++){
		        long v=(i%2!=0)?(long)(j+1)<<i:(long)(a-j)<<i;
		        System.out.print(v+" ");
		        
		    }		    
		    System.out.println();
		}

	}
}
