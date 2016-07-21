package java_pran_programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;


class WordFreq
{
	public static void main(String args[])
	{// for self practise dont remove.
	/*	File file=new File("C:/Program Files/Java/java programs/java_ola_programs/src/java_pran_programs/java WordFreq results/test_WordFreq.txt");
		//to write to a file
		try {
			PrintWriter Output =new PrintWriter(file);
			Output.println("some shit");
			Output.println(45);
			Output.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("error man");
			e.printStackTrace();
		}
		*/
		//to read from a file
		//need to add try catch clause if above comment block is removed
		//Scanner in;
				//in = new Scanner("C:/Users/ACER/Desktop/sem3textfiles/old_ip/eight cousins.txt");
				//String content=in.nextLine();
		FilenameFilter filter = new FilenameFilter() {
		    public boolean accept(File dir, String name) {
		        return name.endsWith(".txt");
		    }
		};

		File folder = new File("C:/Users/ACER/Desktop/sem3textfiles/old_ip/");
		File[] listOfFiles = folder.listFiles(filter);
		String content = null ;
		for (int i = 0; i < listOfFiles.length; i++) {
		    File file = listOfFiles[i];
		    try {
		    	boolean flag=false;
				 content = FileUtils.readFileToString(file);
				 System.out.println("content of file : "+content);
				 do{
					 File file2=new File("C:/Program Files/Java/java programs/java_ola_programs/src/java_pran_programs/java WordFreq results/test_WordFreq_1.txt");	 
				 }while(flag);
				 //
				 if(content.isEmpty())
					 System.out.println("Empty content !");
					 else{
						 //analyse content 
						 
					 
				 
					 }	 
				 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();}
		    // do something with the file
		
		}
	}
	}