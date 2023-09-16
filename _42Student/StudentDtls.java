package _42Student;

public class StudentDtls {
    public static void main(String[] args) {
        
        Student[] s = new Student[5];
        s[0] = new CollageStudent(101, 66, 3);
        s[1] = new CollageStudent(102, 77,6);

        s[2] = new SchoolStudent(201,66,"10th");
        s[3] = new SchoolStudent(202, 72,"12th");
        s[4] = new SchoolStudent(203, 80,"10th");
 
         int count =0;
        for(int i = 0; i <s.length; i++) {
            s[i].show();
        }
          for(int i = 0; i <s.length; i++) {
           int Search = 102;
          
           while (s[i].getRollNo() == Search){
              System.out.println(Search);
            if ( s[i] instanceof CollageStudent){
                System.out.println("This is a collage student : ");
                break;
            } else{
                System.out.println("This Student are School student : ");
                break;
            }
         }  
        
          if(s[i].peresentage > 75){
            ++count;

          }
         }
          System.out.println("Total Student of above 75 % : " +count);
 } 
}
