import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DublicatCharCount {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter String name : ");
        String word=scanner.nextLine();

      Map<Character,Integer> charCountMap = new HashMap<>();
      for(int i=0 ;i <word.length()  ;++i){
        char ch=word.charAt(i);
     if (charCountMap.containsKey(ch)) { 
           charCountMap.put(ch, charCountMap.get(ch) + 1); 
      } else {
           charCountMap.put(ch, 1); 
      } 
       int count = 0 ;
      for(Character c : charCountMap.keySet()){

        if (charCountMap.get(c) > 1){
            ++count;
             System.out.println(count);

        }
       
      }
    
      }
    }
}
