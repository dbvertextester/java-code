import java.util.Scanner;

public class _33Person {
    public String name;
    public int age;

    public void SetAge(){
        this.age=18;
    }

    _33Person(String name, int age){
        this.name=name;
        this.SetAge(); 
    } 
    public void display(){
        System.out.println("Name: "+this.name+", Age:"+this.age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Persion name : ");
        String name = sc.nextLine();
        _33Person p =new  _33Person (name ,20 );
        p.display();
    }
}
