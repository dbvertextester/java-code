public class MissingNumber {
    public static void main(String[] args) {
        
        int[] arr1 = {1,2,4,3,6};
        System.out.println("Missing Number: "+missingNum(arr1));
    }

public static int missingNum(int[] arr){
    int n = arr.length + 1;
    int sum = n *(n+1)/2;
    int restSum = 0;
    for(int i=0; i<arr.length; i++){
        restSum+=arr[i];
    }
   int missingNumbers = (sum - restSum);

    return missingNumbers;

}
}