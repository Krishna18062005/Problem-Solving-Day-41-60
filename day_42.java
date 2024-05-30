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
