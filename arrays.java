public class arrays {
    public static void main(String[] args) {
        
        int array[][] = new int[5][0];

        for (int i=0; i < array.length; i++){
            for(int j=i+1; j<array.length; j++){

           
            System.out.println("Element " +i+ ": "+array[i][j]);
        }

         }
    }
}
