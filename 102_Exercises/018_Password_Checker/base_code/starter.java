import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
		int weak = 0;
		int S1 = 0;
		int S2 = 0;
		int strong = 0;
        for(int a = 0;a<count;a++){
            if(passwords[a].indexOf("!") != -1){
                if(passwords[a].length()>7){
                    strong++;
                }
                else{
                    S2++;
                }
            }
            else if(passwords[a].indexOf("@") != -1){
                if(passwords[a].length()>7){
                    strong++;
                }
                else{
                    S2++;
                }
            }
            else if(passwords[a].indexOf("#") != -1){
                if(passwords[a].length()>7){
                    strong++;
                }
                else{
                    S2++;
                }
            }
            else if(passwords[a].indexOf("$") != -1){
                if(passwords[a].length()>7){
                    strong++;
                }
                else{
                    S2++;
                }
            }
            else if(passwords[a].indexOf("%") != -1){
                if(passwords[a].length()>7){
                    strong++;
                }
                else{
                    S2++;
                }
            }
            else if(passwords[a].indexOf("^") != -1){
                if(passwords[a].length()>7){
                    strong++;
                }
                else{
                    S2++;
                }
            }
            else if(passwords[a].indexOf("&") != -1){
                if(passwords[a].length()>7){
                    strong++;
                }
                else{
                    S2++;
                }
            }
            else if(passwords[a].indexOf("*") != -1){
                if(passwords[a].length()>7){
                    strong++;
                }
                else{
                    S2++;
                }
            }
            else if(passwords[a].length()>7){
                S1++;
            }
            else{
                weak++;
            }
        }
    System.out.println("Weak passwords: " + weak);
    System.out.println("Strong level 1 passwords: " + S1);
    System.out.println("Strong level 2 passwords: " + S2);
    System.out.println("Strongest passwords: " + strong);
		
	}
}
