import java.util.Scanner;

public class ArraySumAndAVG {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Arrays Size : ");
        int n=sc.nextInt();
        int array[]  = new int[n];

        System.out.println("Enter Array value");
         int sum =0 ; double avrg = 0;


        for(int i=0; i<array.length; i++ ){
        array[i] = sc.nextInt();
        sum = sum + array[i];
        }
         avrg = sum / array.length;
        System.out.println("Sum of Array : "+ sum );
        System.out.println("Average of Array : "+  avrg);
}
}