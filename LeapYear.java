import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in );
        System.out.print("Enter a year: ");

        int year = sc.nextInt();

        if(year % 4 == 0){
            System.out.println("it is  leap year "+ year);
        }else if (year % 400 == 0){
            System.out.println("It's  a leap year " + year);
        } else {
            System.out.println("not a  leap year "+ year);
        }
    }
}
