package Ccode;

public class Factorial {
    
    public static void main(String[] args) {
        
        int f = 5;
        int  factorial = 1;
        for (int i=1; i<= f; i++){
            factorial = factorial * i;
            System.out.println("Factorial of  "  + (factorial));
        }
    }
}
