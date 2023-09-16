public class SecoundHigh {
    public static void main(String[] args) {
        
    
    int[] arr = {50,90,418,458,798,126};

    int secoundHigh = 0;
    int highest = 0;
    int end = arr.length;

    for (int i=1; i < arr.length; i++){

        if(arr[i] > highest){
            secoundHigh = highest;
            highest = arr[i];
         }
        if( arr[i] > secoundHigh){
           // secoundHigh = arr[i];
        }
    }
    System.out.println("SecoundHighest Number : "+secoundHigh);
      
    }
 
}
