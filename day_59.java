
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Maximum Coins -Seven dayss..
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int cou=0;
		int c=a;
		while(cou!=7){
		    if(b==7){
		        c*=2;
		        b=1;
		    }
		    else if(b==1){
		        c*=2;
		        b=2;
		    }
		    else{
		        c+=5;
		        b++;
		    }
		    cou++;
		}
		System.out.print(c+"");
		

	}
}
