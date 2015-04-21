package java_pran_programs;
import java.lang.String;
class StringMani{
    public static void main(String args[])
    {   
    	String age ="27";
        String number ="234332";
        
        int a= Integer.parseInt(age)/2;
        double num =Double.parseDouble(number);
        Double res1 =num*2.3;
        System.out.println(" res1 : "+res1);
        
        System.out.println(" res2 : "+a);
        String[] numbers ={"27","34","44","22","55"};
        //enhanced for 
        int res=0;
        for(String temp: numbers){
            
            res += Integer.parseInt(temp);
            
        }
        System.out.println("SUMMATION : "+res);
        
    }
}