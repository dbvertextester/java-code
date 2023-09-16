import java.util.Scanner;

public class MaqthOperation {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the X number: ");
        int x = sc.nextInt();
         System.out.print("Enter the y number: ");
        int y = sc.nextInt();

         System.out.print(" Addition " +  ( x+y ));
         System.out.println("\n Multiply "+   (x*y));
         System.out.println("\n Power "+   Math.pow(x, y));

    }


}
