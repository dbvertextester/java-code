package _41Facalty.java;

public class Facalty {
    
    int facaltyId;
     double salary;

    public int getFacaltyId() {
        return facaltyId;
    }
    public void setFacaltyId(int facaltyId) {
       this.facaltyId = facaltyId;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Facalty [FacaltyId=" + facaltyId + ", salary=" + salary + "]";
    }
   
}