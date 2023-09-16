package Test;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value ");
        int n = sc.nextInt();
        for (int i=0; i <= n; i++){
            if(isPrime(i)){
                System.out.print( i+ " ");
            }
        }
    }
    public static boolean isPrime(int n) {
        
         if(n<=1){
            System.out.println("Not a prime number " + n);
            return false;
        }
        for(int i=2; i<=n/2; i++){
            if( n % i == 0){
               return false;
            } 
        }
          return true;  
      }  
 
}
    

