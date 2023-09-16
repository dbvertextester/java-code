package _42Student;

import java.util.Scanner;

interface Taxable {
    double salTax = 0.7;
    double incomeTax = 0.105;

    abstract void calTax();
}

class Employee implements Taxable {

    int empId;
    String name;
    double salary;

    Employee(int empId, String name, double salary){
        this.empId=empId;this.name=name;this.salary=salary;
    }
     @Override
    public void calTax() {
     
        double Tax = (salary * incomeTax ) ; 
        System.out.println(" Total year of tax : "+ Tax );
    }
}

class Product implements Taxable {

    int pid;
    double price;
    int quantity;

    Product(int pid, double price, int quantity){
        this.pid=pid;this.price=price;this.quantity=quantity;
    }

    @Override
    public void calTax() {

       double  productTax = salTax * quantity;
       System.out.println(" Total product Tax of year "+ productTax); 
 
    }

}

public class _45Tax {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Employee[] e = new Employee[1];
        for(int i=0; i<e.length; i++){
        System.out.println(" Enter the Emplyoee Ditails : ");
        System.out.print(" Enter the Emplyoee Id : ");
        int eid =sc.nextInt();
        System.out.print(" Enter the Emplyoee name : ");
        String ename =sc.next();
        System.out.print(" Enter the Salary for employee :");
        double esal =sc.nextDouble();
        
        e[i]= new Employee(eid, ename, esal);
        e[i].calTax();
  
        Product[] products = new Product[2];
        System.out.print("Enter the   product ID : ");
        int  name = sc.nextInt();

        System.out.print(" Enter the product price : ");
        Double price =sc.nextDouble ();

        System.out.print("Enter the product quantity : ");
        Integer qnty = sc.nextInt();

        products[i]= new Product(name, price, qnty);
        products[i].calTax();
        }

    }
    
}
