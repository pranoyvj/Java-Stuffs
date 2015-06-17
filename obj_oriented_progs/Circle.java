package obj_oriented_progs;

class Circle
{

	private double radius;
	 private String color;
	private double area;
	public Circle(double radius,String color)
	{
		this.radius=radius;
		this.color= color;
	}
	
	public Circle(double radius)
	{
		this.radius=radius;
		this.color= "Red";
	}
	
	public double getRadius() //getter
	{
		return radius;
		
	}
	public String getColor() //getter for color
	{
		return color;
		
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
		//return radius;
	}
	
	
	public void setColor(String color)
	{
		this.color=color;
		//return radius;
	}
	public double  getArea()
	{
		area=3.14*radius*radius;
		return area;
		
	}
	public String toString()
	{
	  return"circle radius : "+radius + " color=" + color;	
	}
}
	