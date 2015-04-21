package java_pran_programs;

import java.util.Scanner;
class Operations_twoNumbers
{
    
    public static void main (String args[])
    {
        int num1,num2,result,op_num,Test;
        
        System.out.println("Enter the 1st input number : ");
        Scanner in=new Scanner(System.in);
        num1=in.nextInt();
        System.out.println("Enter the 2nd input number : ");
        String user_ip;
        num2=in.nextInt();
        //Test=num1+num2; //testing
        //System.out.println("Test : "+Test);//testing
        
        do{
        System.out.println("Enter the operation to be performed : ");
        System.out.println("press '1' for modulus operation ");
        System.out.println("press '2' for multiplication operation ");
        System.out.println("press '3' for Addition operation ");
        
        op_num= in.nextInt();
        switch(op_num){
         case 1:
             System.out.println("Performing Modulus Op : ");
             Modulus(num1,num2);
             break;
         case 2:
             System.out.println("Performing Multiplication Op : ");
             Multiplication(num1,num2);
             break;
         case 3:
             System.out.println("Performing Addition Op : ");
             addition(num1,num2);
             break;
        }
        System.out.println("Do you want to continue? : 'yes' or 'no' ");
        
        user_ip=in.next();
            
          }while(user_ip.equalsIgnoreCase("yes"));
        
    }
    public static void addition(int param1,int param2)
        {
            System.out.println("Result of Addition Op is : ");
            int result_op;
            result_op= param1 + param2;
            System.out.println("  "+result_op );
        }
    public static void Multiplication(int param1,int param2)
        {
            System.out.println("Result of Addition Op is : ");
            int result_op;
            result_op= param1*param2;
            System.out.println("  "+result_op );
        }
    public static void Modulus(int param1,int param2)
        {
            System.out.println("Result of Addition Op is : ");
            int result_op;
            result_op= param1%param2;
            System.out.println("  "+result_op );
        }        
}
//just to see testing