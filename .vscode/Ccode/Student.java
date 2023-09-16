package Ccode;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        
   

    Scanner sc = new Scanner (System.in);
    System.out.print(" Enter First subject Number : ");
    int sub1=sc.nextInt();
    System.out.print("Enter Secound  Subjec Number : ");
    int sub2=sc.nextInt();
    System.out.print(" Enter Thred subject Number : ");
    int sub3=sc.nextInt();

    double avrg = (sub1 + sub2 + sub3)/3  ;
    System.out.println(" Total avrg : " + avrg);
    if ( avrg > 75){
        if (sub1  > 80  && sub2 > 80 && sub3 > 80){

            System.out.println(" This is Pass and more then 80 all subject "+ avrg);
            
        } else {
            System.out.println ("This is Fail");
        }
    }

    } 
}
