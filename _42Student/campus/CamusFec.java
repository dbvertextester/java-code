package _42Student.campus;

import java.util.Scanner;

import campus.data.campus.academics.Fecalty;

public class CamusFec {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Fecalty[] f = new Fecalty[5];
        for (int i=0 ;i<f.length;++i){
            System.out.println("Enter the Fecalty id");
            int fecltyId = (sc.nextInt());
            System.out.println("Enter the Fecalty name");
            int fecName = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the Fecalty Salary");
            double fecSalary = (sc.nextDouble());
            System.out.println("Enter the Fecalty Breanch");
            String fecBranch =  (sc.nextLine());
            
            f[i] = new Fecalty(fecltyId,fecName,fecSalary,fecBranch);

       }

       double sal =0;
       for (Fecalty fec : f ){
          sal = sal + fec.getFecSalary();
          System.out.println(" Total of all Emp Salary : "+sal);
       }
    }
}
