import java.util.Scanner;

public class Years {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Days :  ");
        int days=sc.nextInt();

         


        int years=(days/365);
         System.out.println("Years of number "+ years);


         int reminingDay = days - 365*years;
         int month = reminingDay/30;
         System.out.println("Moth :  - "+ month);
         
         int d = reminingDay - 30*month;
         System.out.println(" Days :- "+ d);




    }
}
