package Test;
public class Gratest {
    public static void main(String[] args) {
        
         int a =  100, b =  0, c = 11, d = 10;
        System.out.println("The value of the variable is " );
        if (a > b){
            if(a > c){
                if (a > d){
                    System.out.println(" Value of a is big : " +a);
                } else {
                    System.out.println ("Value of D is biggest: "+d);
                } 
             } 
                 
                }
        
         if (b > a){
            if(b > c){
                if ( b > d){
                    System.out.println(" Value of b is big : "+b);
                } else{
                    System.out.println("value of d is biggest "+d);
                }
                }
            }
        
        if (c > a){
            if(c > b){
                if (c > d){
                    System.out.println(" Value of c is big : "+c);
                   
                }else{
                    System.out.println("value of d is biggest "+d);
                 
                }
            }
      }
        if (d > a){
            if(d > b){
                if (d > c){
                    System.out.println(" Value of d is big : "+d);
                }else{
                    System.out.println("value of c is biggest "+c);
                   
                }
                     
        }
        
    }
}
}
