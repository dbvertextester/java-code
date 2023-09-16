package campus.data.campus.academics;
import campus.data;
public class Student extends Person{

    int rollNo;
    String breanch;
    int semester;
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getBreanch() {
        return breanch;
    }
    public void setBreanch(String breanch) {
        this.breanch = breanch;
    }
    public int getSemester() {
        return semester;
    }
    public void setSemester(int semester) {
        this.semester = semester;
    }
    public Student(int rollNo, String breanch, int semester) {
        this.rollNo = rollNo;
        this.breanch = breanch;
        this.semester = semester;
    }
    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", breanch=" + breanch + ", semester=" + semester + "]";
    }
    
    
}
