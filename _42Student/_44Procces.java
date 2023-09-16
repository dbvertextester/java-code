package _42Student;

import java.util.Scanner;

abstract class Process {
    int data;

    void show(){
        System.out.println("data = " + this.data);
    }
    abstract void Process();     

}

class Fectorial extends Process{

    double fect = 1;
    Fectorial(int data){
        this.data = data;
    }
   
     @Override
    void Process() {
          while(data > 0){
            fect=fect * data;
            --data;
          }
          System.out.println("This is fectorial : "+fect);
    }

}

class Circle extends Process{
    double redies;

    Circle(int redies){
        this.redies = redies;
    }

    @Override
    void Process() {
        double Area = Math.PI * redies * redies;

        System.out.println("Area of : "+Area);
    }
}

public class _44Procces {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         System.out.print(" Enter the Number : ");
         int data1 = sc.nextInt();

         System.out.print("Enter the choise \\n 1) Fectorial \\n 2) Circle Area : ");
         int chioce =sc.nextInt();
         switch(chioce){
            case  1: {
                Fectorial f = new Fectorial(data1);
                f.Process();
                break;
            }
            case 2: {
                Circle c = new Circle(data1);
                c.Process();
                break;
            }
            default:{
                System.out.println("Invalid Choise !");
                break;
         }
     
    }
    }
}