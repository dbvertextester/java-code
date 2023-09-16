import java.util.Scanner;

public class Armostream {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number : ");
        int num =sc.nextInt();

        int temp = 0 ;
          temp = num ;
        int p = 0 ;

        while (num > 0){
            int rem = num % 10;
            p = p + (rem * rem * rem );
            num = num /10 ;
       
    }
    if(temp == p ){
        System.out.println("Armstrong Number");
    } else {
        System.out.println("Not an armstrong number ");
    }
    }
}