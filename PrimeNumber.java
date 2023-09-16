import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrimeNumber(int num) {
        if (num <=1){
           return false;
        }
        for ( int i=2; i<= Math.sqrt(num); i++){
            if (num % i == 0 ){
                 return false;
            } 
            
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number : ");

        int num=sc.nextInt();

        isPrimeNumber(num);
        if (isPrimeNumber(num)){
            System.out.println(num + " Prime number "+ isPrimeNumber(num));
        } else {
            System.out.println(num+ " Not a prime Number");
        }

    }
    }

