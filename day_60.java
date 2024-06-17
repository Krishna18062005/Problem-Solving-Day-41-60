import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Reverse Pattern Printing-Numbers
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sn=(n*(n+1)/2);
		for(int i=0;i<n;i++){
		    int ss=sn-i;
		    for(int j=n+1;j>1+i;j--){
		        if(j==n+1)
		        System.out.print(ss+" ");
		        else
		        System.out.print((ss-=j)+" ");
		    }
		    System.out.print("\n");
		}

	}
}
