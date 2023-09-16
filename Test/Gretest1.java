package Test;

import java.util.Scanner;

public class Gretest1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any 4 digit number : ");

        int val = sc.nextInt();
        
        int a = val % 10;
        int b = (val / 10)% 10;
        int c = (val / 100)% 10; 
        int d = val/1000;

       
        if (a > b){
            if(a > c){
                if (a > d){
                    System.out.print(" Value of a is big : "+a);
                }
            }
        }
         if (b > a){
            if(b > c){
                if ( b > d){
                    System.out.print(" Value of b is big : "+b);
                }
            }
        }
        if (c > a){
            if(c > b){
                if (c > d){
                    System.out.print(" Value of c is big : "+c);
                }else
                    System.out.println("value of d is big : "+ d);
       
            }
        }
    }
}
