package StarPattern;

public class Five {
    public static void main(String[] args) {
        
        int n = 5;
        for (int i=n ;i>=1;i--){

             int p = 1;
            for (int j=1; j<=i; j++){
              
                System.out.print(p++ +" ");

            }
            System.out.println();
        }    
    }
}
