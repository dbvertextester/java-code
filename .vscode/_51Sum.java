import java.util.Scanner;

public class _51Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        String num = sc.nextLine();

        String[] sp = num.split(",");

        int sum =0;
        for(String number : sp){
            sum +=Integer.parseInt(number);
        }
        System.out.println("Total String sum " +sum );
 
    }
}
