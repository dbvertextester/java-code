public class Sorting {
    
    public static void main(String[] args) {
        
        int[] arr = new int[]{5,7,9,3,6,5,2};
        System.out.println("Before sorting: " );

        for(int i=0; i<arr.length; i++){
           for (int j=0; j<arr.length; j++){

             if(arr[i] < arr[j] ){
                int temp = arr[i];
                arr[i]=  arr [j];
                arr[j] = temp;
             }
           }
               
        }
        for( int n : arr){
            System.out.print(n+" ");
           }
 
    }
}
