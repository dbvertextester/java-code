public class MathOparation {

    
    public static void maltiyplay(int a, int b){
           int  c = a * b ;
           System.out.println(" result : "+ c);
    }   
          public static void maltiyplay(float a, float b, float c){
        float  f = a * b * c;
          System.out.println(" result : " + f);
          }    
          public static void maltiyplay(double a, int b){
        double  d = a * b ;
          System.out.println(" result : " + d);
             
    }
    
    public static void main(String[] args) {
        maltiyplay(5,7);
        maltiyplay(14.5f, 15.02f, 15.50f);
        maltiyplay(10.5, 015);
        
    }
}
