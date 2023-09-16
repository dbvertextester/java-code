package _42Student;

public class Student {
    
     
    
    int rollNo;
    double peresentage;
 
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getPeresentage() {
        return peresentage;
    }

    public void setPeresentage(double peresentage) {
        this.peresentage = peresentage;
    }

    public Student() {
    } 

    public Student(int rollNo, double peresentage) {
        this.rollNo = rollNo;
        this.peresentage = peresentage;
    }
   public void show(){
        System.out.println("Student rollNo is: " + this.rollNo + " "
                           + "and Student peresentage is: "
                           + this.peresentage);
        
    }
    
}
