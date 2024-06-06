import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Sort Common Substring Values;
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int x=sc.nextInt();
		List<String> ans=new ArrayList<>();
		for(int i=0;i<=s1.length()-x;i++){
		    String str=s1.substring(i,i+x);
		    if(s2.contains(str)){
		        ans.add(str);
		    }
		}
		if(ans.size()==0){
		    System.out.print(-1);
		    return;
		}
		else{
		    Collections.sort(ans);
		    for(String s:ans){
		        System.out.print(s+" ");
		    }
		}

	}
}
