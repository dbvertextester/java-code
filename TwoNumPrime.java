import java.util.Scanner;

public class TwoNumPrime {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int f = sc.nextInt();
        System.out.print("Enter the second number : ");
        int s=sc.nextInt();
  
          int flage = 0 ;
        for (int i = f; i <= s; i++){
            
            if(i <=1)
            continue;

            flage = 1;
 
            for(int j=2; j<= s/2; ++j){
               if(i % j == 0){
                   flage = 0;
                    break;
                }  
            }

            if(flage == 1 ){
                System.out.println( i + " ");
            }
        }
    }
}
