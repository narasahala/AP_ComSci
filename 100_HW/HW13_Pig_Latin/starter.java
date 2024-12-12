/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.*;
class starter {
	public static void pigLatin(String s){
		String [] sentence = new String[s.length()];
		for(int a = 0; a<sentence.length; a++){
			sentence[a] = s.substring(a,a+1);
		}
		int a = 0; 
		String b = "";
		int c = 0;
		while(true){
			if(a == s.length()){
				System.exit(0);
			}
			if(sentence[a].equals("a") || sentence[a].equals("e") || sentence[a].equals("i") || sentence[a].equals("o") || sentence[a].equals("u") || sentence[a].equals("A") || sentence[a].equals("E") || sentence[a].equals("I") || sentence[a].equals("O") || sentence[a].equals("U")){
				c = 0;
				while(true){
					if(a+c==sentence.length){
						System.out.print("-way ");
						System.exit(0);
					}
					else if(sentence[a+c].equals(" ")){
						System.out.print("-way ");
						break;
					}
					else{
						System.out.print(sentence[a+c]);
					}
					c++;
				}
				a = a + c + 1;
			}
			else{
				if(a+1==sentence.length){
					break;
				}
				if(sentence[a+1].equals("a") || sentence[a+1].equals("e") || sentence[a+1].equals("i") || sentence[a+1].equals("o") || sentence[a+1].equals("u") || sentence[a+1].equals("A") || sentence[a+1].equals("E") || sentence[a+1].equals("I") || sentence[a+1].equals("O") || sentence[a+1].equals("U")){
					c = 1;
					while(true){
						if(a+c==sentence.length){
							System.out.print("-" + sentence[a] + "ay ");
							System.exit(0);
						}
						else if(sentence[a+c].equals(" ")){
							System.out.print("-" + sentence[a] + "ay ");
							break;
						}
						else{
							System.out.print(sentence[a+c]);
						}
						c++;
					}
					a=a+c+1;
				}
				else{
					c=2;
					while(true){
						if(a+c==sentence.length){
							System.out.print("-" + sentence[a] + sentence[a+1] + "ay ");
							System.exit(0);
						}
						else if(sentence[a+c].equals(" ")){
							System.out.print("-" + sentence[a] + sentence[a+c] + "ay ");
							break;
						}
						else{
							System.out.print(sentence[a+c]);
						}
						c++;
					}
					a = a + c + 1;
				}
			}
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		String s = sc.nextLine();
		pigLatin(s);
	}
}
