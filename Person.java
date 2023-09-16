 class PersonInfo {
 
    public static String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        PersonInfo.name = name;
    }

    public int age;
    public int setAge(int age){
        if(age <= 0 ){
        System.out.println("Default AGE is 18");
         age = 18;
        }
     
        return this.age=age;
    }
    
    public int getAge (){
        return this.age=age;
    }
    public void display(){
        System.out.print("\nName:  "+ name);
        System.out.println("\n Age  " + age);
    }

}
public class Person{

   
    public static void main(String[] args) {
        
        PersonInfo p = new PersonInfo();
        p.setName(" ram");
        p.setAge(0);

        p.display();
        // PersonInfo p1 = new PersonInfo();
        // p1.setName("Rajudi");
        // p1.setAge(-23);

        //  PersonInfo p2 = new PersonInfo();
        // p2.setName("Raju");
        // p2.setAge(0);

        // System.out.println("ramu call " + p.getName() + " " + p.getAge());
        
        // System.out.println("rajudi call "+p1.getName() + " " + p1.getAge());
        //  System.out.println("raju call "+p2.getName() + " " + p2.getAge());
    }
}