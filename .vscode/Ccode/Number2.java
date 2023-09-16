package Ccode;

public class Number2 {
    
    
    public static void main(String[] args) {
        
        for(int i=1; i<=3; i++){
            for(int j=1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k=1; k<=3; k++){
              for(int j=3; j >=k; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
