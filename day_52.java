import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Sort - Domain Names
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String ar[]=new String[n];
		for(int i=0;i<n;i++){
		    String inp=sc.next();
		    ar[i]=inp.split("@")[1];
		}
		Arrays.sort(ar);
		HashMap<String ,Integer> map=new HashMap<>();
		for(String i:ar){
		    if(map.containsKey(i)){
		        map.put(i,map.get(i)+1);
		    }
		    else{
		        map.put(i,1);
		    }
		}
		LinkedHashSet<String> set=new LinkedHashSet<>();
 		for(String i:ar){
 		    String k=i;
 		    
            for(String j:ar){
        
 		        if(map.get(k)<map.get(j)){
		            k=j;
		            
 		        }
 		    }
 		    set.add(k);
		    map.put(k,0);
 		}
 		for(String i:set){
 		    System.out.println(i);
 		}

	}
}
