package _42Student;

public class CollageStudent extends Student {
    
    int semester ;

    public int  getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public CollageStudent(int  semester) {
        this.semester = semester;
    }

    public CollageStudent(int rollNo, double peresentage, int  semester) {
        super(rollNo, peresentage);
        this.semester = semester;
    }

    @Override
    public void show(){
         super.show();
        System.out.println("Semester  : "+  this.semester);
    }
     

    
}
