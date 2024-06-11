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
