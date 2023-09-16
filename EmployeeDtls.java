  class EmployeeDtls1  {

    private   int empNo;
    private  double salary;

     private static int empCount = 0;
    private static double totalSalary = 0.0;

    public EmployeeDtls1(double d) {
    }

    public  void Employee(double salary){
        empNo = ++empCount;
        this.salary = salary;
        totalSalary += salary; 
    }

    public int getEmpNo (){
        return this.empNo = empNo;
    }
    public double getSalary (){
        return this.salary= salary;
    }
    public static void display (){
        System.out.println("Employee number : - "+ empCount);
        System.out.println("Employee total salary : "+ totalSalary);
    }

 } 


public class EmployeeDtls {
    public static void main (String args[]){

        EmployeeDtls1 e1 = new EmployeeDtls1(2500.50);
        EmployeeDtls1 e2 = new EmployeeDtls1(3000.00);

        EmployeeDtls1.display();

        System.out.println(e1.getEmpNo());

}
