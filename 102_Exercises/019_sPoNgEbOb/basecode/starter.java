/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static String spongeCase(String a){
		String c = "";
		for(int b = 0; b<a.length(); b++){
			String letter = a.substring(b, b+1);
			if(b%2 == 0){
				letter = letter.toLowerCase();
			}
			else{
				letter = letter.toUpperCase();
			}
			c = c + letter;
		}
		return c;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Say a sentence");
		String sentence = sc.nextLine();
		while(true){
			if(sentence.indexOf(" ") == -1){
				System.out.print(spongeCase(sentence));
				break;
			}
			int space = sentence.indexOf(" ");
			String a = sentence.substring(0, space);
			System.out.print(spongeCase(a) + " ");
			sentence = sentence.substring(space+1);
		}
	}
}
