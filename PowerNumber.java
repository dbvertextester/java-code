import java.util.Scanner;

public class PowerNumber {

    public static void main(String[] args) {
        
    
    
    int p;
    Scanner sc = new Scanner(System.in);

    System.out.print(" Enter number : ");

    int num = sc.nextInt();

    for (int i=0; i <= num; i++){

        p = (int) ( Math.pow(i, 2));
        System.out.println("Power of " + i + " is: "+p );
    }

}
}
