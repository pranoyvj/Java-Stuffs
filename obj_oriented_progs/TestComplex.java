package obj_oriented_progs;

class TestComplex{
	public static void main(String args[])
	{
		MyComplex m1=new MyComplex(4,7);
		MyComplex m2=new MyComplex(8,22);
		final MyComplex m3=new MyComplex(15,4);
		
		m1.Setreal(1);
		m2.Setimag(19);
		System.out.println(m2.Getreal());
	
		System.out.println(m1.equals(45, 22));
		System.out.println(m1.equals(1,7));
		System.out.println(m2.magnitude());
		System.out.println("argumentInDegrees : "+m2.argumentInDegrees());
		System.out.println("argumentInRadians : "+m2.argumentInRadians());
		System.out.println(m1);
		System.out.println(m2);
		m1.add(m2);
		System.out.println(m1);
		m1.subtract(m3);
		System.out.println(m1);
		m1.multiply(m2);
		System.out.println(m1);
		
	}
}

/*
Write an application called MyComplexApp that uses the MyComplex class. The application shall prompt the user for two complex numbers, print their values, check for real, imaginary and equality, and carry out all the arithmetic operations.
Enter complex number 1 (real and imaginary part): 1.1 2.2
Enter complex number 2 (real and imaginary part): 3.3 4.4
  
Number 1 is: (1.1 + 2.2i)
(1.1 + 2.2i) is NOT a pure real number
(1.1 + 2.2i) is NOT a pure imaginary number
  
Number 2 is: (3.3 + 4.4i)
(3.3 + 4.4i) is NOT a pure real number
(3.3 + 4.4i) is NOT a pure imaginary number
   
(1.1 + 2.2i) is NOT equal to (3.3 + 4.4i)
(1.1 + 2.2i) + (3.3 + 4.4i) = (4.4 + 6.6000000000000005i)
(1.1 + 2.2i) - (3.3 + 4.4i) = (-2.1999999999999997 + -2.2i)
*/