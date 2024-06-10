class Solution {
    public int heightChecker(int[] heights) {
        int[] hei=new int[heights.length];
        for(int i=0;i<heights.length;i++) hei[i]=heights[i];
        Arrays.sort(hei);
        int c=0;
        for(int i=0;i<hei.length;i++){
            if(hei[i]!=heights[i]) {
                c++;}
        }
       
        return c;
        
    }
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Sum First & Unit Digits
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] in=new String[n];
		for(int i=0;i<n;i++) in[i]=sc.next();
		for(int i=0;i<n;i++){
		    String fd=""+in[i].charAt(0);
		    String ld=""+in[i].charAt(in[i].length()-1);
		    int ls=0;
		    int rs=0;
		    for(int j=0;j<n;j++){
		        if(j<i&&in[j].endsWith(fd)) ls+=Integer.parseInt(in[j]);
		        else if(j>i&&in[j].endsWith(ld)) rs+=Integer.parseInt(in[j]);
		    }
		    System.out.println(ls+" "+rs);
		}

	}
}
