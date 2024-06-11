import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Double Continuously repeated sum
		Scanner sc=new Scanner(System.in);
		List<Integer> ips=new ArrayList<>();
		int p=0;
		int ss=0;
		while(sc.hasNext()){
		    int a=sc.nextInt();
		    if(ss==0)
		    ss=p;
		    if(p!=a){
		        ss=0;
		    }
		    if(p==a){
		        
		        ss=ss*2;
		    
		    ips.add(ss);}
		    else ips.add(a);
		    p=a;
		    
		}
		int s=0;
		for(int i:ips){
		    
		    s+=i;
		   
		}
		System.out.print(s);
		

	}
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Sort based on Weight;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		int[] we=new int[n];
		int max=0;
		for(int i=0;i<n;i++){
		    int nu=sc.nextInt();
		    ar[i]=nu;
		    if(nu%4==0&&nu%6==0) we[i]+=4;
		    if(nu%2==0) we[i]+=3;
		    if(((int)Math.sqrt(nu)*(int)Math.sqrt(nu))==nu) we[i]+=5;
		    max=Math.max(max,we[i]);
		}
		List<String> ans =new ArrayList<>();
		for(int i=0;i<=max;i++){
		    for(int j=0;j<n;j++){
		    if(we[j]==i)
		    ans.add(ar[j]+" "+we[j]);
		}
		    
		}
		for(String i:ans){
		    System.out.print(i);
		}

	}
}
