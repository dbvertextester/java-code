import java.util.Scanner;

public class Sort {
    public static void main(String[] args) throws Exception{

         int temp= 0;
         int[] arr = new int[]{2,6,8,3,4};
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] < arr[j]) {    
                    temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
        System.out.println ();

        for(int i=0; i<arr.length;i++){
            System.out.print (arr[i]+ "  ");
        }
    }

}
