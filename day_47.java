import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//REARRAnge Bits-Yes?NO
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		String na=Integer.toBinaryString(a);
		String nb=Integer.toBinaryString(b);
		if(na.length()<nb.length()){
		    System.out.print("NO");
		    return;
		}
		else{
		    if(count1(na)==count1(nb)){
		        System.out.print("YES");
		    }
		    else{
		        System.out.print("NO");
		    }
		}

	}
	public static int count1(String a){
	    int c=0;
	    for(char i : a.toCharArray()){
	        if(i=='1'){
	            c++;
	        }
	    }
	    return c;
	}
}
