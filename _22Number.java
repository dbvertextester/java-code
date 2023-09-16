import java.util.Scanner;

public class _22Number {

    public static void main(String[] args) {
          Scanner sc = new Scanner (System.in);
        System.out.print(" Enter the Number  : ");
        int num=sc.nextInt();

        int sum = 0;
        for(int i=1; i<=num; i++){
            sum = sum + i * 2;
          
        }
        System.out.println(" Calculatye the Sum : "+sum);
    }
    

}
