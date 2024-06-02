import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Print Date Format 
		Scanner sc=new Scanner(System.in);
		String date=sc.nextLine();
		String Ard[]=date.split("-");
		String ans="";
		int j=0;
		int[] ar=new int[2];
		for(String i :Ard){
		    if(i.length()==4){
		        ans+="YYYY ";
		    }
		    else if(i.length()==3){
		        ans+="MMM ";
		        
		    }
		    else{
		        ans+="DUP"+j;
		        ar[j++]=Integer.parseInt(i);
		    }
		}
		
		     if(ar[1]==0)
		     ans=ans.replace("DUP"+0,"DD ");
		     else{
		         if(ar[0]<=12&&ar[1]<=12) {System.out.print(-1);return;
		     }
		         else{
		             if(ar[1]>12){
		                 ans=ans.replace("DUP1","DD ");
		                 ans=ans.replace("DUP0","MM ");
		             }
		             else if(ar[0]>12){
		                ans=ans.replace("DUP1","MM ");
		                ans=ans.replace("DUP0","DD ");
		             
		             }
		         }
		     }
		 
		      //  if(k<12){
		      //      ans+="DD ";
		      //  }
		      //  else{
		      //      ans+="MM ";
		      //  }
		    
		
		System.out.print(ans.trim().replace(" ","-"));
	}
}//KRCE-->CSBS-->Krishna K
