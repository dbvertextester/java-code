import java.util.Scanner;

public class GrossSalary {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  basic salary : - ");
        double bs = sc.nextInt();

        double Hra, DA , Gross;
        if(bs < 1500){
              Hra = bs * 10 /100 ;
             DA = bs * 90 /100 ;
        } else {
            Hra = 500;
            DA = bs * 98 / 100;
        }

        Gross = bs + Hra + DA ;
        System.out.println(Gross);
    }
}
