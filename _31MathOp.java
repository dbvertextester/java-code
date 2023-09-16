import java.util.Scanner;

public class _31MathOp {

   
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print(" Enter the value of X : ");
    int x = sc.nextInt();
     System.out.print(" Enter the value of Y : ");
    int y = sc.nextInt();

    Calculate obj=new  Calculate ();
     obj.add(x, y);    
     obj.mul(x, y);
     obj.power(x, y);


    }
    
}
