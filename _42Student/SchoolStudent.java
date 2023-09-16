package _42Student;

public class SchoolStudent extends Student {

    String  className;

     public String getClassName() {
        return className;
    } 
    public void setClassName(String className) {
        this.className = className;
    } 
    public SchoolStudent(String className) {
        this.className = className;
    } 
    public SchoolStudent(int rollNo, double peresentage, String className) {
        super(rollNo, peresentage);
        this.className = className;
    }
     public void show(){
        super.show();
        System.out.println("\n C10 : " + this.className);
    }
    
 
}
