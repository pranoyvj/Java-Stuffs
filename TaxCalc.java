package java_pran_programs;
import java.util.Scanner;

public class TaxCalc{
	public static void main(String args[])
	{	double tax;
		double salary;
		Scanner in= new Scanner(System.in);
		
		String userIp;
		do{
		System.out.println("Enter the salary of the person : ");
		salary=in.nextDouble();
		System.out.println(" the salary of the person is : "+salary);
		System.out.println("Calculating tax : ");
		
		
		if(salary<=15000){
			System.out.println("Tax is 10% of "+salary);
			tax=0.1*salary;
			System.out.println("final Tax is to pay : "+tax);
		}else
			if(salary>15000 && salary<=40000){
				System.out.println("Tax is 20% of "+salary);
				tax=0.2*salary;
				System.out.println("final Tax  to pay is : "+tax);
			
		}
			else{System.out.println("Tax is 30% of "+salary);
			tax=0.3*salary;
			System.out.println("final Tax to pay is : "+tax);
				
			}
		System.out.println("Do you want to repeat? : ");
		userIp=in.next();
		}while(userIp.equalsIgnoreCase("Yes"));
	
	}
}