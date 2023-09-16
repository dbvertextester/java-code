package Test;
 
public class Prime {
    
    public static boolean isPrime (int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<=n/2; i++){
            if( n % i == 0){
              return false;
            } 
        }
        return true;
        // System.out.println(" Prime Number "+ n);
        
    }
 
    public static void main(String[] args) {
     
       int f = 0;
       int l = 50;

       for(int i=f; i <=l; i++){
        // System.out.println(i);
        if( isPrime(i)){
            System.out.print(i + " ");
        }
       
       }
    }
}