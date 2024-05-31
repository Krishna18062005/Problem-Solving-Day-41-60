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
