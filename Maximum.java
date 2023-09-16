import java.util.Scanner;

public class Maximum {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");        
       
        int a, b, c ;
            int num = sc.nextInt();
        a = num / 100 ;
        b = ( num / 10)% 10 ;
        c=num % 10 ;

        if(a > b){
            if(a> c) {
                System.out.println("\n" + "Maximum is: "+ a );
            }
        } if ( b> a ){
            if(b>c ) {
                System.out.println("\n"+ "Maximum is:" + b );
        }
            } else {
                System.out.println("\n"+ "Maximum is:"+ c );
            }
}
}

    