package _41Facalty.java;

public class Fulltime extends Facalty {
    
    double basic;
    double allowance;
    

Fulltime(int facaltyId, double basic, double allowance){
    this.facaltyId=facaltyId;
    this.salary = basic + allowance;
}
public void display(){
    System.out.println("Facalty id " + facaltyId);
    System.out.println("Salary is "+ salary);
}
}

