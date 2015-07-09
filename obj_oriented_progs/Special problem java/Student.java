package obj_oriented_progs;

import java.util.*;

class Student  {
	private int id;//id stored as index to arraylist marks. so getting output is easy.
	public String StudentName;
	
	private int NumberOfSubjects =15;
	public int i=1;
	public int totalMarks=0;
	public ArrayList<Integer> marks = new ArrayList<Integer>(15); // marks for 15 subjects out of 100!!!

	public Student(int j, String name,ArrayList<Integer> marks ) {
		this.id=j;
		this.StudentName=name;
		this.marks=marks;
		calTotalMarks();
		
		//id++;
	}
	public Student( ) {		
	}
	
	public void setStudentName(String name){ //set student name
		this.StudentName=name;
	    }
	
	public String getStudentName(){
		return this.StudentName;//return student name
		}
	
	public int calTotalMarks( ){
		for(i=0;i<NumberOfSubjects;i++){
			totalMarks +=marks.get(i);
			}
		return totalMarks;
		}
}