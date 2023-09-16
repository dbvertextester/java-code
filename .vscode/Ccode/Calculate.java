package Ccode;

public class Calculate {
    public static void main(String[] args) {
        
         double n = 10;

         double sum = 0.0;
         for( double i=1; i<= n; i++){
            System.out.println("i: " + ( sum + 1/i));
         }
    }
}
