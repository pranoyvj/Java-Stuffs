package java_pran_programs;
import java.util.Scanner;
class TwoDimArray{
    public static void main (String args[])
    {   int temp;
        Scanner in=new Scanner(System.in);
        int[][] twodimArray=new int[3][3];
        
        for (int i=0;i<3 ;i++ ){
            for (int j=0;j<3 ;j++ )
            {   System.out.println("Enter values for 2D array at position "+"["+i+"]"+"["+j+"]");
                temp=in.nextInt();
                twodimArray[i][j]=temp;
            }
        }
        System.out.println("Printing out matrix :  ");
        for (int i=0;i<3 ;i++ ){
            for (int j=0;j<3 ;j++ )
            {
                System.out.print(twodimArray[i][j]);
            }
            System.out.println( );
        }
    }
    
}