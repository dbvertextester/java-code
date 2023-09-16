import java.util.Scanner;

public class MyThread implements Runnable {

   
    @Override
    public void run() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Line Number : ");
        int n = sc.nextInt();
        System.out.println("MyThread is Running .... ");
         for(int i=n; i>0; i--){ 
            for(int j=0; j<i; j++){
             System.out.print( "*" + " ");
            try {
                Thread.sleep(1000);
             } catch (Exception e){
                System.out.println(e.getMessage());

            }
         }
         System.out.println();
        }
        System.out.println("MyThread is Running End "); 
        sc.close();
 }
  
}
