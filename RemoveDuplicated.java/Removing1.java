import java.util.Arrays;

public class Removing1 {
    
    public static void main(String[] args) {
        
        int[][] matrix = new int[][]{
            {1,2,9,5,9,8,3},
            {1,5,9,5,7,8,5},
            {1,2,2,5,9,9,3},
            {1,3,9,5,9,9,4}
        };

        for (int[] input : matrix){
            System.out.println("Input: " + Arrays.toString(input));
            System.out.println("call the Remove merthod : "+ Arrays.toString( removeDublicate(input)));
        }
        }
     
        public static int[] removeDublicate (int[] input){

            Arrays.sort( input );
            int[] result = new int[input.length];
            int previous = input[0];
            result[0] = previous;   

            for( int i=1; i < input.length; i++){
                int ch = input[i];

                if(previous != ch){
                    result[i] = ch;
                }
                previous = ch;
            }
            
            return result;

        }
}
