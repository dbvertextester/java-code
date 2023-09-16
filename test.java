/* Online Java Compiler and Editor */
import java.util.Scanner;
public class test  {

     public static void main(String []args){
         
         Scanner sc = new Scanner(System.in);
        System.out.print(" Enter 3 Digit Number :- ");
        int num = sc.nextInt();
 
        int rev =0; int r = 0;
        while (num > 0 ){
            r = num % 10 ;
            rev = (num *10)/10;
            num = num / 10;
        }
        while( rev > 0){
            
            r = rev % 10 ;
       }
    switch (r){
            case 1 : 
                System.out.println("One");
                break;
            case 2 : 
                System.out.println("Two");
                break;
            case 3 : 
                System.out.println("Three");
                break;
            case 4 : 
                System.out.println("Four");
                break;
            case 5 : 
                System.out.println("Five");
                break;
            case 6 : 
                System.out.println("Six");
                break;
            case 7 : 
                System.out.println("Saven");
                break; 
            case 8 : 
                System.out.println("Eight");
                break;
            case 9 : 
                System.out.println("Nine");
                break;
            case 0 : 
                System.out.println("Zero");
                break;
            default  : 
                System.out.println("Invalid");
                break;    
        }
        
        rev = rev / 10;
        
      
        
     }
}