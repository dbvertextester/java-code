package StarPattern;

public class Three {
    
    public static void main(String[] args) {
        for(int i=1,p=0; i<=5; i++, p+=2){
            for(int j=1; j<=i; j++){
                System.out.print(p+" ");
            }
            System.out.println();

        }
    }
}
