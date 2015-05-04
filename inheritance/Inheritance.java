package inheritance;

class Superclass 
{
    public static void area(double len,double bre)
    {
        System.out.println("Calculating area");
        System.out.println("Area : "+len*bre);
    }

}
class SquareArea extends Superclass{
    
}

