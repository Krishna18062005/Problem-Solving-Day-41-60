import java.util.*;
public class Hello {
    public static void main(String[] args) {
		//Flipping Bits 32-Bit Format
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    int a=sc.nextInt();
		    System.out.println(Long.valueOf(mod(Integer.toBinaryString(a)),2)+"");
		}
	}
	public static String mod(String a){
	    int l=a.length();
	    String s="111111111111111111111111111111111";
	    String ans=s.substring(0,32-l);
	    for(char i:a.toCharArray()){
	        if(i=='1') ans+='0';
	        else ans+='1';
	    }
	    return ans;
	}
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Repeated & Missing Integer
		Scanner sc=new Scanner(System.in);
		int d=0;
		int s=0;
		int n=0;
		Set<Integer> a=new HashSet<>();
		while(sc.hasNext()){
		    int inp=sc.nextInt();
		    n=(n<inp)?inp:n;
		    
		    if(a.contains(inp)){ d=inp;}
		    else{ a.add(inp);s+=inp;}
		}
		
		int ans=((n)*((n+1))/2)-s;
		System.out.print(d+" "+ans);

	}
}
public class solution {
public static int[] primeEncoder(int[] input1,int input2)
{
    int ip=1;
int prime=2;
while(ip<input2){
  prime++;
    if(checkprime(prime)) ip++;
    
}
int ans[]= new int[input1.length];
for(int i=0;i<input1.length;i++){
    ans[i]=prime+input1[i];
}
return ans;
}

public static void main(String[] args){
  int arr[]={1,2,3,4,5};
  int ans[] =primeEncoder(arr,5);
  for(int j:ans)
    System.out.print(j);
}

    public static boolean checkprime(int a) {
        if (a <= 1)
            return false;
        if (a == 2 || a == 3)
            return true;
        if (a % 2 == 0 || a % 3 == 0)
            return false;
        for (int i = 5, w = 2; i * i <= a; i += w, w = 6 - w) {
            if (a % i == 0)
                return false;
        }
        return true;
    }
}
