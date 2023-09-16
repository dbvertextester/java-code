import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) throws Exception{

        
        FileReader fr = new FileReader("D:\\Note.txt");
        BufferedReader bf = new BufferedReader(fr);

        Scanner sc = new Scanner(bf);
         int count = 0;
        while(sc.hasNextLine()){
            String line=sc.nextLine();
            // for(int i=0; i<line.length(); i++){
            //     if ((line.charAt(i) == 't')){
            //         count++;
            // }
           for(int i=0; i<line.length(); i++){
            if (Character.isLetterOrDigit(line.charAt(i))){
                count++;
            }
           
        
        }
         }
         System.out.println(count);
}
}
