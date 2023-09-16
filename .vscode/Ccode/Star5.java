package Ccode;

public class Star5 {
    
    public static void main(String[] args) {
        int alfabet =65;
        for(int i=1; i<=10; i++){
            for(int j=1;j<=i; j++){
                System.out.print((char)alfabet+ " ");
                alfabet++;
            }
            System.out.println();
        }
    }
}
