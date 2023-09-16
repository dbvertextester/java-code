package StarPattern;

public class Secound {
    
    public static void main(String[] args) {
        
        int n = 6;
        for(int i=1, p=1; i<n; i++,p++){
            for(int j=1; j<=i; j++){
                System.out.print( p+"  ");
            }
            System.out.println();

        }
    }
}
