public class SecondHighest {
    

public static void main(String[] args) {

int[] numbers = {10, 20, 30, 40, 50, 60, 70};

int highest = Integer.MIN_VALUE;

int secondHighest = Integer.MIN_VALUE;

for(int num : numbers) {

if(num > highest) {
secondHighest = highest;
highest = num;
} else if (num > secondHighest) {
secondHighest = num;
}

}

System.out.println("The second highest number in the array is: " + secondHighest);

}

}

