import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Shift Binary -Largest Integer;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String numStr=Integer.toBinaryString(num);
		int max=0;
		for(int i=0;i<numStr.length();i++){
		    String newStr=numStr.substring(i)+numStr.substring(0,i);
		    int newInt=Integer.parseInt(newStr,2);
		    max=(newInt>max)?newInt:max;
		    
		}
		System.out.print(max);

	}
}
