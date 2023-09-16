import java.util.Scanner;

public class Marrige {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print(" Enter the Age of Persion : ");
        int age1=sc.nextInt();
        System.out.println(" Enter the Gender  : ");
         System.out.println("  one (1) is Male  ");
        System.out.println("  Zero (0) is Male  ");
        int gender = sc.nextInt();

        if(age1 > 18){
            System.out.println("This persion is eligible to  marriage");
        }else {
             System.out.println("This persion is Not eligible to  marriage");
        }
        
        switch(gender){
            case  1: 
                  System.out.println("This Persion is Male");
                  break;
            case  0:
                   System.out.println("This persion is Female");  
                   break;    
        }
    }
}
