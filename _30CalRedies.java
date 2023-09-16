import java.util.Scanner;

public class _30CalRedies {

    public static Double Calculate(double redies){
        double area = 3.146 * redies * redies;
        return area;
    }
     
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the Redies : ");
         double redies = sc.nextDouble();
         System.out.print(Calculate(redies));

    }
}
