public class Transpose {

    static int N = 4;
     private static void transpose(int[][] A, int[][] B) {
        for(int i=0; i<N ; i++){
            for (int j=0; j < N; j++){
                B[i][j]= A[j][i];
                System.out.print(B[i][j] +" ");
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        
        int A[][] = { {1,1,1,1},
                      {2,2,2,2},
                      {3,3,3,3},
                      {4,4,4,4} };

    ;
    int B[][] = new int[N][N];
        transpose(A,B);
        for (int i=0; i<N; i++){
            for (int j=0; j<N; j++){
                System.out.print(B[i][j] + " ");
               
            }
             System.out.print("\n");

        }
    }
   
}