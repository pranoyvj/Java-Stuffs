package obj_oriented_progs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class School
{	public int j; //this will be used as id!!
    private String ans;
	private String name;
	public int NumberOfGrade5Students;
	public ArrayList<Integer> marks = new ArrayList<Integer>(15);
	public ArrayList<Integer> studentList = new ArrayList<Integer>();
	public int studentcount=1;
	Student s = new Student();
	HashMap<Integer, Integer> IDandMarks=new HashMap<Integer, Integer>();
	
	public School(String name, int NumberOfGrade5Students)
	{
		this.name=name;
		this.NumberOfGrade5Students=NumberOfGrade5Students;
		
		for( j=1;j<=NumberOfGrade5Students;j++)// j is id!!
		{	
			System.out.println(" Enter the  fullname of student: ");
			Scanner in = new Scanner(System.in);
			s.StudentName=in.nextLine(); 
			//System.out.println(marks.size());
			System.out.println(" Enter the marks for 15 subjects( each subject max 100 marks, min 0) of this student :"
					+ " IF in case the student is absent, then  put  marks for that subject as 0                          ");
			for(int k=1;k<=15;k++)
			{ // while there are inputs
				int m = in.nextInt(); 
				marks.add(m);
				System.out.println(k);//for debugging
			}
			System.out.println("   ");
			System.out.println("Verify if the marks that you have entered are correct !  ");
			for(int k=0; k < marks.size(); k++ ){
				System.out.print(" "+marks.get(k));
			} 
			System.out.println("   ");
			System.out.println("Are the marks correct? answer 'yes' or 'no' : ");
			Scanner inString = new Scanner(System.in);
			ans=inString.nextLine().toString();
			
			//Student[] studentObject=new Student[StudentCounter]; //something new:: created array of objects of class Student
			if(ans.equals("yes") || ans.equals("YES") || ans.equalsIgnoreCase("Yes"))
			{
				Student studentObject= new Student(j,s.StudentName,marks); //arraylist passed as an argument to a constructor while it has been instantiated
				System.out.println("Total marks of student out of 1500 : "+studentObject.totalMarks);
				IDandMarks.put(j, studentObject.totalMarks);
				if(j<NumberOfGrade5Students)
				System.out.println("Please Enter Details for next Student : ");
				System.out.println("   ");
				continue;
			}else {	System.out.println("   ");
						System.out.print("Please Submit the marks of all the 15 subjects again! : ");
						s.marks.clear();
						for(int k=1;k<=15;k++)
							{ // while there are inputs
							int m = in.nextInt(); 
							s.marks.add(m);
							System.out.println(s.marks.size());//for debugging
							}
						Student studentObject=new Student(j,s.StudentName,marks); //arraylist passed as an argument to a constructor while it has been instantiated
						System.out.println("Total marks of student out of 1500 : "+studentObject.totalMarks);
						IDandMarks.put(j, studentObject.totalMarks);
						System.out.println("   ");
						System.out.println("Please Enter Details for next Student : ");
						System.out.println("   ");
						continue;
					}			
		}
	}
	
	public String setName(String name){
		this.name=name; 
		return this.name;
	}
	
	public String getName(){
	return this.name;//return school name
	}
	
	public String toString(){
		return "School name : "+getName();
	}
}
/*
5,3,2,4,5,6,7,3,2,5,7,8,3,4,5
In a country made up of 36 States. 
The education ministry wants to know the rankings of sates based on the performance of Grade 5 Student. 
So every school is to upload the result of all 15 subjects offered by each student to the a general server. 
At the end of the input of all students, the server outputs the updated result which is (Name of States, 
Name of Best school and Student for each states and overall best student school and state). 
Assuming that there are at least 10 schools in each state. Write a simple Java program that achieves this
*/