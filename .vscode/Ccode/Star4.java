package Ccode;

public class Star4 {
    public static void main(String[] args) {
        
      
        for(int i=1; i<6; i++){
              int alfabet = 65;
            for(int j=1; j<=i; j++){
                System.out.print((char)(alfabet));
                alfabet++;
            }
            System.out.println();
        }
    }
}
