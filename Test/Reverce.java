package Test;

public class Reverce {
    
    public static void main(String[] args) {
        
        int[] arr = {10,20,30,40,50};
        
         int start = 0;
         int end = arr.length -1;

         for(int i=0; i<arr.length; i++){

            if(start < end ){
                int  temp = arr[start];
                arr[start] = arr[end];
                arr[end ] = temp ;
            }
           
         }
          for (int j : arr)
            System.out.println(j);
         
    }
}
