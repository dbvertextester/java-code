public class Highest {
    public static void main(String[] args) {
        
        int[] arr = {10,80,90,45,17,89};
        
       int  max = arr[0];
        for (int array : arr){
        
            if (array > max){
                max = array;
        }
       }
     System.out.println(max);
    }
}
