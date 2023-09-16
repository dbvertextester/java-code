import _42Student.Employee;

public class Employee1 {
    private static int empCount = 0;   // To keep track of the total number of employees
    private static double totalSalary = 0.0;   // To keep track of the total salary of all employees

    private int empNo;      // Employee number (auto-incremented)
    private double salary;  // Salary of the employee

    // Parameterized constructor
    public Employee1(double salary) {
        empNo = ++empCount;   // Increment and assign the employee number
        this.salary = salary;
        totalSalary += salary;   // Add the salary to the totalSalary
    }

    // Class method to display total employees and totalSalary
    public static void displayTotal() {
        System.out.println("Total employees: " + empCount);
        System.out.println("Total salary: $" + totalSalary);
    }

    // Getters for empNo and salary (optional)
    public int getEmpNo() {
        return empNo;
    }

    public double getSalary() {
        return salary;
    }
}


 

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(2500.0);
        Employee emp2 = new Employee(3000.0);
        Employee emp3 = new Employee(4000.0);

        Employee.displayTotal();  // Display total employees and total salary

        // You can also access individual employee details using getters if required
        System.out.println("Employee 1 - empNo: " + emp1.getEmpNo() + ", salary: $" + emp1.getSalary());
        System.out.println("Employee 2 - empNo: " + emp2.getEmpNo() + ", salary: $" + emp2.getSalary());
        System.out.println("Employee 3 - empNo: " + emp3.getEmpNo() + ", salary: $" + emp3.getSalary());
    }
}


Total employees: 3
Total salary: $9500.0
Employee 1 - empNo: 1, salary: $2500.0
Employee 2 - empNo: 2, salary: $3000.0
Employee 3 - empNo: 3, salary: $4000.0