public class wordCount {
    public static void main(String[] args) {
        
        String str = " My@Name23 is% 43shubham $Patel ";

        String[]   word =  str.trim().split("[@ ,%$1234567890 ]+",10 );
        
        for (String s : word){
            System.out.println(s);
        }
        System.out.println(" Number of wrd : "+ word.length);
    }
}
