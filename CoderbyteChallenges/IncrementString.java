package CoderbyteChallenges;

/*public class IncrementString
{
	public static void main(String args[])
	{
	String str= "hello";
	String op = "";
	char arr[] =str.toCharArray();
	for(char c:arr)
	{
		System.out.println((int)c); //to print ascii value of character (UTF-16) use (int)
		op += (char)(((int)c + 1-97)%26 +97);
		if(op.length() > 0)
		{
			//if(op.charAt(op.length()-1) =='a'){
				//int ind=op.length()-1;
				//op.='A';
				//op.re('a', 'A');
			}
		}
	
	System.out.println("Incremented String = "+op); 
	}}
*/

import java.util.*; 
import java.io.*;

class IncrementString {  
  String LetterChanges(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
      String op = "";
      //str="hello";
	char arr[] =str.toCharArray();
	for(char c:arr)
	{	
		if(c==' '){
			op +=" ";
		}
		else
		//System.out.println((int)c); //to print ascii value of character (UTF-16) use (int)
		op += (char)(((int)c + 1-97)%26 +97);
		
	}
	if(op.isEmpty() == false)
		{
			if(op.contains("a")){
				op=op.replace('a', 'A');
			}
			if(op.contains("e")){
				op=op.replace('e', 'E');
			}
			if(op.contains("i")){
				op=op.replace('i', 'I');
			}
			if(op.contains("o")){
				op=op.replace('o', 'O');
			}
			if(op.contains("u")){
				op=op.replace('u', 'U');
			}
			} 
    return op;
  
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    IncrementString c = new IncrementString();
    System.out.print(c.LetterChanges(s.nextLine())); 
  }   
  
}