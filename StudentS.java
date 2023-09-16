import java.util.ArrayList;

  class Student1 {
    
    String name;
    int RollNo;
    int age;
    int score;
    public Object display;

/**
 * @param name
 * @param RollNo
 * @param age
 * @param score
 */
Student1(String name, int RollNo, int age,int score){
    this.name=name;
    this.RollNo=RollNo;
    this.age = age ;
    this.score=score;
}
public void display(){
if(score < 50){
    System.out.print("0-50");
} else if (score < 65){
    System.out.println("50-65");
} else if(score < 100){
    System.out.println("65 - 100");
}
}    
}
public class StudentS{
 
    public static void main(String[] args) {
        
        Student1 s1 = new Student1("Anil", 101, 20, 60);
        Student1 s2 = new Student1("arman", 102, 22, 80);
        Student1 s3 = new Student1("aruhi", 103, 20, 60);
        Student1 s4 = new Student1("Ram", 104, 18, 74);  
        Student1 s5 = new Student1("Ram", 108, 20, 60);               
        Student1 s6 = new Student1("shyam", 105, 20, 90);
        Student1 s7 = new Student1("kapil", 106, 20, 60);
        Student1 s8 = new Student1("makhan", 107, 20, 69);
        Student1 s9 = new Student1("Ram", 109, 20, 50);
        Student1 s10 = new Student1("Ram", 110, 20, 60);

         Student1[] student1s = new Student1[]{s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};
        // ArrayList<Student> list =new ArrayList<>();
        // list.addAll(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
 
        for (Student1 studebnt1 : student1s) {
            
       
        System.out.println("\n\t\tList of students" + student1);
        student1.display();
        // student1s.display();
        }
        

        }

    }

