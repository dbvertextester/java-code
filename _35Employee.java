class Employees12{

    int emoNo;
    double salary;

    static int totalEmp = 0;
    static double totalSal = 0.00;
 
      Employees12(  double salary){
         emoNo = ++totalEmp;
         this.salary=salary;
         totalSal += salary;
    }

    public static void display( ){

        System.out.println("Total no of employees : "+totalEmp);
         System.out.println("Total of salary in all Employee : "+totalSal);
       

    }

     
} 
public class _35Employee {
    public static void main(String[] args) {
        Employees12 e1 = new Employees12(500.00);
        Employees12 e2 =new Employees12 (600.00 );
        Employees12.display();
        
      
    }

}
