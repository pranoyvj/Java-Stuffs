package CoderbyteChallenges;

import java.util.*; 
import java.io.*;

class Main {  
  public static String LongestWord2(String string) { 
	  String sen="Argument goes here";
	  int longestLen=1;
	  String longestWord="";
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    	String words[] = sen.split(" ");
    		for(int i=0;i<words.length;i++)
		{   
			if(words[i].length() > longestLen)
			{
				longestLen=words[i].length();
				longestWord=words[i];
				sen=words[i];
			}
			else{	
				if(words[i].length() == longestLen && longestLen>1)
				{
					System.out.println("Multiple Longest Words exist "+words[i]);
                    sen=words[i];
				}
				else{
					if(words[i].length() == longestLen && longestLen==1 && words[++i]==null)
						System.out.println("Multiple Longest Words exist "+words[i]);
                  		sen=words[i];
				}
			}
			
		}
		//System.out.println("Longest Word : "+longestWord);
       
    return sen;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord2(s.nextLine())); 
  }   
  
}