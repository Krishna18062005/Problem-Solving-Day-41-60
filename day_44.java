import java.util.*;
public class Hello {
    public static int max(int a){
        int m=0;
        while(a>0){
            m=(m<a%10)?a%10:m;
            a/=10;
        }
        return m;
    }
    // public static int modify(int X,int a,int b){
    //     int rs=0;
    //     while(X>0){
    //         if(X%10==a){
    //             rs=rs*10+b;
    //         }else{
    //             rs=rs*10+(X%10);
    //         }X/=10;
    //     }
    //     return rs;
    // }
    // public static int rev(int a){
    //     int rs=0;
    //     while(a>0){
    //         rs=rs*10+a%10;
    //         a/=10;
    //     }
    //     return rs;
    // }

    public static void main(String[] args) {
		//Replace max Digits -Two Integers.
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int maxDiX=max(X);
		int maxDiY=max(Y);
	    String rsltX=Integer.toString(X);
	    rsltX=rsltX.replaceAll(maxDiX+"",maxDiY+"");
		System.out.print(Integer.parseInt(rsltX)+Y);
}}
