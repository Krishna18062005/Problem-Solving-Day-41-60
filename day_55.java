import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Swap Even Integers Pair;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		int c=0;
		for(int i=0;i<n;i++){
		    ar[i]=sc.nextInt();
		    c=(ar[i]%2==0)?c+1:c+0;
		}
		//c=(c%2==0)?c:c-1;
		int[] ev=new int[c];
		int id=0;
	//	System.out.print(c);
		for(int i=0;i<n;i++){ 
		if(ar[i]%2==0){ 
		ev[id++]=i;}}
		c=(c%2==0)?c:c-1;
		for(int i=0;i<c-1;i+=2){
		    int t=ar[ev[i+1]];
		    ar[ev[i+1]]=ar[ev[i]];
		    ar[ev[i]]=t;
		}
		for(int i:ar){
		    System.out.print(i+" ");
		}

	}
}
