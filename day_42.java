import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Article Pages & Lines
		Scanner sc=new Scanner(System.in);
		int characters=sc.nextInt();
		int lines=sc.nextInt();
		int lineCharacters=sc.nextInt();
		int onePageCharacters=lines*lineCharacters;
		int pages=characters/onePageCharacters;
		int k=characters%onePageCharacters;
		System.out.println((k==0)?pages:pages+1);
		int minPages=(characters/lineCharacters);
		

		k=characters%lineCharacters;
		
		System.out.print((k==0)?minPages:minPages+1);

	}
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Remove Characters of Next Word
		Scanner sc=new Scanner(System.in);
		String W=sc.nextLine(); 
		String[] Ar=W.split(" ");
		for(int i=0;i<Ar.length-1;i++){
		    String ans="";
		    for(char j:Ar[i].toCharArray()){
		        
		    if(j!=' '&&!Ar[i+1].contains(""+j))
		    
		    ans+=j;
		}
		if(ans!="")
		    System.out.print(ans.trim()+" ");
		}
		System.out.print(Ar[Ar.length-1].trim());

	}
}
