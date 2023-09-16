 
import java.util.Scanner;

public class _52WeeksDay {
    
    public static void main(String[] args)throws Exception {
        
       String[] day =  {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday" };
       Scanner scanner=new Scanner (System.in);
      
       System.out.print("Enter the number of days : ");
        int n=scanner.nextInt();
        try{
        if(n >= 0 && n <= 6){
            System.out.println(day[n]);
        }
        } catch (Exception e){
            System.out.println("Please enter only o to 6");
        }




    }
}
