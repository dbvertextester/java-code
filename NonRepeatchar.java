import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatchar {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();

        Map <Character, Integer> charCountMap = new  HashMap<>();
        for( int i = 0; i < str.length(); i++){

            char c = str.charAt(i);
            charCountMap.put(c,charCountMap.getOrDefault(c, 0) + 1);
        }

        for (int i=0; i<str.length(); i++){

            char c = str.charAt(i);
        
            if( charCountMap.get(c) == 1){
                System.out.println("This charactor is non  repeated " + str + " : "+c);
                break;
            }
        }
    }
}
