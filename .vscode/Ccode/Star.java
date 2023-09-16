package Ccode;

public class Star {
    public static void main(String[] args) {
        int num = 6;
        for (int i=1; i <= num; i+=2){
           
          for( int j=0; j<i; ++j ){

            System.out.print(  " * ");
        }
        System.out.println();
    }
}
}
