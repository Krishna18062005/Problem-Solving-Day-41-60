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
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Sort Messages -Chronological Order
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		char[] person=new char[N];
		int[] time=new int[N];
		String[] message=new String[N];
		for(int i=0;i<N;i++){
		    person[i]=sc.next().charAt(0);
		    String t=sc.next();
		    time[i]=Integer.parseInt(t.replace(":",""));
		    message[i]=sc.nextLine();
		}
		for(int i=0;i<N;i++){
		    for(int j=i+1;j<N;j++){
		        if(time[i]>time[j]){
		            int temp=time[i];
		            time[i]=time[j];
		            time[j]=temp;
		            char tem=person[i];
		            person[i]=person[j];
		            person[j]=tem;
		            String te=message[i];
		            message[i]=message[j];
		            message[j]=te;
		        }
		    }
		}
		for(int i=0;i<N;i++){
		    System.out.println(person[i]+":"+message[i].trim());
		}

	}
}
