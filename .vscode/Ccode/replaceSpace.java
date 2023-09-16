package Ccode;

public class replaceSpace {

    public static void main(String[] args) {
        String s = "We #$%%  happy. ";
        String s1 = s.replaceAll(" \\s ", "");
        String[] s2 = s.trim().split("");

        for( String str : s2){
        System.out.print(str);
    }
     System.out.print(s1);
}
}