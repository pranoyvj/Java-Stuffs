package obj_oriented_progs;

import java.util.ArrayList;
import java.util.Scanner;

class State
{
private String name;
private int NumberOfSchools;
private String BestSchool;
private String BestStudent;
public int NumberOfGrade5Students;
public int rank;
public String ans2;
//public ArrayList<Integer> school = new ArrayList<Integer>();
School[] school=new School[100];//assumed maximum 100 schools in a state.

public State(String name,int NumberOfSchools ){
	this.name =name;
	this.NumberOfSchools=NumberOfSchools;
	for(int k=1;k<=NumberOfSchools;k++){
		//initialize school object
		System.out.println("Enter the name of School : ");
		Scanner inString = new Scanner(System.in);
		ans2=inString.nextLine().toString();
		System.out.println("Enter the Number Of Grade 5 Students in this School named "+ans2+" : ");
		Scanner num = new Scanner(System.in);
		NumberOfGrade5Students=num.nextInt();		
		school[k] =new School(ans2,NumberOfGrade5Students);//school name and number of grade 5 students
	}
}
public String BestSchoolFromState(){
	return this.BestSchool;
}
public String BestStudent( ){
	return this.BestStudent;
}
public String getStateName(String name){
	
	return this.name;
}
public int getNumberOfSchools( ){
	//this.NumberOfSchools=NumberOfSchools;
	return NumberOfSchools;
}
public void setNumberOfSchools(int NumberOfSchools){
	this.NumberOfSchools=NumberOfSchools;
	//return NumberOfSchools;
}

}

/*

In a country made up of 36 States. 
The education ministry wants to know the rankings of sates based on the performance of Grade 5 Student. 
So every school is to upload the result of all 15 subjects offered by each student to the a general server. 
At the end of the input of all students, the server outputs the updated result which is (Name of States, 
Name of Best school and Student for each states and overall best student school and state). 
Assuming that there are at least 10 schools in each state. Write a simple Java program that achieves this
*/