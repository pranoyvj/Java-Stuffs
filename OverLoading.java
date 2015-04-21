package java_pran_programs;

class MainOverloading{
	public static void main (String args[])
	{
		Maths obj=new Maths();
		double res=(double) obj.max(211, 334);
		System.out.println("result larger number is : "+res);
	}
}
	
	class Maths{
		double max;
	public int max(int a, int b)
	{
	if(a>b){
		max=a;
	}else{
		max=b;
	}
	System.out.println("Integer version called!! ");
	return (int) max;
	}
	public double max(double a, double b)
	{
		if(a>b){
		max=a;
		}
		else{
		max=b;
		}
		System.out.println("Double version called!! ");
	return max;
	}
		
	
}