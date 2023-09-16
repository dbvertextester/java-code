package Ccode;
import java.util.Scanner;

public class ElectricBil {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         System.out.print(" Enter the Current Unite  : ");
        double currentUnit=sc.nextInt();

        System.out.print("Enter the Previuas Unite : ");
        double PreviuasUnit=sc.nextInt();
       
        double total =   currentUnit - PreviuasUnit;
        if ( total <= 100){
            total = total * 2;
            System.out.println(" Total Amount of 0 - 100 Unit Bill : "+total);
        } else if (total <= 200){
            System.out.println(" Total Amount of  100 - 200 Unit Bill : "+total * 3);
        } else if ( total < 300){
            System.out.println("Total Amount of   200 - 300 Unit Bill : " +total * 4);
        } else if ( total > 300){
            System.out.println("Total Amount of more than 300 Unit Bill :"+ total * 5);
        }
    }
}
