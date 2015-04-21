package java_pran_programs;
class EnhancedForArray{
    public static void main(String args[])
    {   int initial =100;
        //int numbers[] =new int[10];
        // can intialize an array in this way:
        int[] b={1,2,3,4,5,7,8,10}; //for
        int[] c= new int[6];
        int[] numArray=new int[10]; // array initialization , [10] indicates size
        for(int i=0;i<10;i++)
        {
            numArray[i]= initial;
            initial++;
        }
        System.out.println("array : ");
        //enhanced for   loop 
        for(int temp : numArray){
            System.out.println(temp);
        }
    }
}