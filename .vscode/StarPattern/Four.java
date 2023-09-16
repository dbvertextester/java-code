package StarPattern;

public class Four {
    
    public static void main(String[] args) {
        
        int n = 5;
        for(int i=n, p=8; i>=1; i--,p-=2){
            
            for(int j=1; j<=i; j++) {
                
                System.out.print(p+" ");
            }
            System.out.println();
        }
}
}
