package java_pran_programs;
//this prog anazlyses all the unique words inside all the text files in a directory
//this program runs in eclipse!!

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;


class WordCount
{
	public static void main(String args[]) throws IOException
{
		FilenameFilter filter = new FilenameFilter() {
		    public boolean accept(File dir, String name) {
		        return name.endsWith(".txt");
		    }
		};

		
		
File folder=new File("C:/Users/ACER/Desktop/sem3textfiles/old_ip");

File[] listOfFiles=folder.listFiles(filter);
HashMap<String, Integer> wordcounts=new HashMap<String, Integer>();

for(int i=0;i<listOfFiles.length; i++)
{
	System.out.println("name of file is  : "+listOfFiles[i].getName());
	System.out.println("   _______________________________________________________________________________________________             ");
	
	
	String	filename2=listOfFiles[i].getName();
	//System.out.println("name of file : "+filename2);
	String filepath=listOfFiles[i].getAbsolutePath();
	System.out.println("path of this file is : "+filepath);
	BufferedReader br;
	try {
		String text="";	
		br = new BufferedReader(new FileReader(filepath));
		
		try {
			System.out.println("content of this file is : ");
			do{
			text=br.readLine();
			
			if(text!=null)
			{
			String[] nWord=text.split(" ");
			
			
			for(String word:nWord)
			{
				//wordcounts.put(word, 1);
				if(!wordcounts.containsKey(word))
				{
					wordcounts.put(word, 1);
				}
				else
				{
					
					wordcounts.put(word,wordcounts.get(word)+new Integer(1));
				}
			}
			}
			//int j=1;
			//File newFile=new File("F:/pvj files/java eclipse workspace/java_pran_progs/src/java_pran_progs/wordcount"+i+".txt");
			try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:/Program Files/Java/java programs/java_programs/src/java_pran_programs/wordcountresult_allDocuments.txt"), "utf-8"))) {
			    writer.write(" word and freq : "+wordcounts.entrySet() );//j++; //taken from http://stackoverflow.com/questions/2885173/java-how-to-create-a-file-and-write-to-a-file
			} catch (IOException ex) {
			    // handle me
			}  
			System.out.println(text);
			
			
			}
			while(br.readLine()!=null && text!=null );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
System.out.println("Total words = " + wordcounts.size()); // this part (next 5 lines) taken from https://courses.cs.washington.edu/courses/cse143/14au/lectures/WordCount.java
System.out.println(" Enter Minimum number of occurrences for printing the words : ");

BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
int min =Integer.parseInt(in.readLine());
System.out.println(" ----------------------------------------------------------------------------------------");
for (String word : wordcounts.keySet()) { //enhanced for loop
    int count = wordcounts.get(word);
    if (count >= min)
        System.out.println(word + "\t" + count); 
}
//System.out.println(" frequency of is :"+wordcounts.get("is"));

}//end main

}