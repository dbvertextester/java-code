package Ccode;

public class Star6 {
    
    

    public static void main(String[] args) {
        
        
        for(int i=1; i<=2; i++){

            int alfabet = 65;
            for(int j=i; j<4; j++){
                System.out.print((char)(alfabet));
                alfabet++;
            }
            for(int k=1; k<=2; k++){
   
            for(int j=4; j>=k; j--){
                System.out.print((char)(alfabet));
                alfabet--;
            }
            
            
            System.out.println();
        }
        }
    }
}
