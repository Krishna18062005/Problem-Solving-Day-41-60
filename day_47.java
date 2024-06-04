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
import java.util.*;
public class Hello {
    public static void main(String[] args) {
		//Xth rank -Students
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		String[] name=new String[N];
		int[] ma=new int[N];
		for(int i=0;i<N;i++){
		    name[i]=sc.next();
		    ma[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++){
		    for(int j=i+1;j<N;j++){
		        if(ma[i]<ma[j]){
		            int t=ma[i];
		            ma[i]=ma[j];
		            ma[j]=t;
		            String te=name[i];
		            name[i]=name[j];
		            name[j]=te;
		        }
		    }
		}
		HashMap<Integer,Integer> map=new HashMap<>();
		int c=1;
		int p=0;
		for(int i:ma){
		    if(map.containsKey(i)){
		        map.put(i,p);
		    }
		    else{
		        p=c;
		        map.put(i,c);
			    }c+=1;
		}
		ArrayList<String> ans=new ArrayList<>();
		for(int i=0;i<N;i++){
		    if(map.get(ma[i])==X){
		        ans.add(name[i]);
		    }
		}
		if(ans.size()==0){ System.out.print(-1); return;}
		Collections.sort(ans);
		for(String i:ans)
		System.out.println(i);
	}
}
