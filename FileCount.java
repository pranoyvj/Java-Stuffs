package java_pran_programs;
//THIS PROG RETURNS ALL TEXT FILES IN A DIRECTORY!!
// in this java prog fileFilter concept used. (see in javanotes)
//FileNameFilter, File[] datatype 

//import java.io.*;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

class FileCount{
    public static void main(String args[]){
        try{
        File direc=new File("C:/Users/ACER/Desktop/sem3textfiles/old_ip");
        FilenameFilter textfilter =new FilenameFilter(){
            public boolean accept(File dir,String name){ // need to be implemented for every instance of FileNameFilter
                String Lowercase_name =name.toLowerCase();
                if ( Lowercase_name.endsWith(""))
                {
                    return true;   
                } else {return false;}
            }    
        }; // ; OR?
        File[] textfiles=direc.listFiles(textfilter); //important line  see the usage , 
        // file data structure created  , then its object textfiles created which is initialized to the parent directory
        // direc ...and listfiles function (lookup in java notes)
        
        for (File file : textfiles){
            if(file.isDirectory()){
                System.out.print("Directory : ");
                //System.out.println(file.getCanonicalPath());
            }
                else{
                    System.out.print("File : ");
                }
            
        System.out.println(file.getCanonicalPath());    
            } }
        catch(IOException e)
            {System.out.print("error");
        }    
            
        } } 