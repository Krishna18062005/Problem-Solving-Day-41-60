import java.util.*;
public class Hello {
    public static int sum(int a){
        int s=0;
        while(a>0){
            s+=a%10;
            a/=10;
        }return s;
        
    }

    public static void main(String[] args) {
		//Maximum Possible Integer
		Scanneer sc=new Scanner(System.in);
		int num=sc.nextInt();
		int fsum=sum(num);
		int dup=num;
		while(dup!=0){
		    if(sum(dup)>fsum){
		        System.out.print(dup);
		        return;
		    }
		    dup--;
		    
		}
		System.out.print(num);

	}
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//HcF Ranges--> Krishna
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int T=sc.nextInt();
		int[] inte=new int[N];
		int[] st=new int[T];
		int[] en=new int[T];
		
		for(int i=0;i<N;i++){
		    inte[i]=sc.nextInt();
		}
		for(int i=0;i<T;i++){
		    st[i]=sc.nextInt();
		    en[i]=sc.nextInt();
		}
		for(int i=0;i<T;i++) printHcf(st[i],en[i],inte);
			}
			public static void printHcf(int s,int e,int[] arr){
			    int hcf=1;
			    int min=Integer.MAX_VALUE;
			    for(int i=s-1;i<e-1;i++){
			        min=Math.min(arr[i],min);
			    }
			    for(int i=min;i>1;i--){
			        boolean hc=true;
			        for(int j=s-1;j<=e-1;j++){
			            if(arr[j]%i!=0) {
			                hc=false;
			                break;}
			        }
			        if(hc){
			            System.out.println(i);
			            return;
			        }
			    }
			    System.out.println(1);
			}
}//KRCE--> CSBS --> KRISHNA K
