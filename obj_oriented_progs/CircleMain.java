package obj_oriented_progs;

class CircleMain{
	public static void main(String args[])
	{
		 
	Circle obj;
	
	obj= new Circle(4.0,"Red")	;
	System.out.println("    "+obj.toString());//explicit call of to string
	System.out.println("radius of circle is :"+obj.getRadius());
	System.out.println("color of circle is :"+obj.getColor());
	System.out.println("Area of circle is :"+obj.getArea());
	System.out.println("    ");
	System.out.println("    "+obj); //implicit call of "to string" function
	obj.setRadius(8.0);
	obj.setColor("black");
	System.out.println("radius of circle is :"+obj.getRadius());
	System.out.println("color of circle is :"+obj.getColor());
	System.out.println("Area of circle is :"+obj.getArea());
	System.out.println("    "+obj.toString());
	}
}