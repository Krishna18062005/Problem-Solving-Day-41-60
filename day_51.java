import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//String Expansion;
		Scanner sc=new Scanner(System.in);
		String inp=sc.next();
		String[] str1=(inp.replaceAll("\\d+"," ").trim()).split(" ");
		String[] str2=(inp.replaceAll("\\D+"," ").trim()).split(" ");
		for(int i=0;i<str2.length;i++){
		    //if(str)
		    int val=Integer.parseInt(str2[i]);
		    if(val%2==0){
		        for(int k=0;k<val;k++)
                         {
                          System.out.print(str1[i]);
                   }}
                   else{
                       System.out.print(str1[i]+""+str2[i]);
                   }
}
		  
		
	}
}
