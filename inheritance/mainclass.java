package inheritance;

class mainclass{
	
	public static void main(String args[])
	{
		Superclass sup = new Superclass();
		System.out.println("superclass area : ");
		sup.area(6.0, 8.0);
		SquareArea sq = new SquareArea();
	    System.out.println("square area : ");
		sq.area(343.0 , 82.0);
	}
    
    
}