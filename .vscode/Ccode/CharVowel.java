package Ccode;

import java.util.Scanner;

public class CharVowel {
    public static void main(String[] args) {
        
        char ch ='t';
             
            switch(ch){
            case 'a':
            case 'e' :
            case 'i':
            case 'o':
            case  'u':
            System.out.print("The character "+ch+"is Vowel.");

            default :
            System.out.print("The character"+ch +"is Not A Vowel.");
        }
    }
    
}
