import java.util.Scanner;

public class _50CountVowel {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        int count=0;
        for (int i = 1 ;i<name.length();i++){
            char ch = name.charAt(i);
            if  (ch  == 'a'|| ch =='i'|| ch=='o'||ch =='e'||ch == 'u'){
                ++count;
                
            }
        }
        System.out.println(count);
    }
}
