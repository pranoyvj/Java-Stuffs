package CoderbyteChallenges;

import java.util.*; 
import java.io.*;

class StringRev {  
  void FirstReverse(String str) { 
   String str1="true",str2="false";
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    //str="eye";
    int length =str.length();
    System.out.println("length of str = "+str.length());
    //for(int i=1;i<=length;i++)
    //	{
    //	}  
    String reverse = new  StringBuffer (str).reverse().toString();
    System.out.println(reverse);
    if(reverse.equals(str))
    	  System.out.println(str1);
    else {
    	 System.out.println(str2);}
   // return reverse;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    StringRev c = new StringRev();
    c.FirstReverse("eye");
    //System.out.print(c.FirstReverse(s.nextLine())); 
  }   
  
}








  