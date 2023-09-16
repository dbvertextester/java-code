public class NumToChar {
    public static void charToNumber(int num) {

         int rev = 0 , r =0;
        while (num > 0){
            r = num % 10 ;
            rev = (rev * 10 ) + r  ;
            num = num/10;

    }
        System.out.println(rev);
        while (r > 0 ) {

            r = rev %10 ;

            switch (r)
        {
        case 1:
            System.out.print("one ");
            break;
        case 2:
            System.out.print("two ");
            break;
        case 3:
            System.out.print("three ");
            break;
        case 4:
            System.out.print("four ");
            break;
        case 5:
            System.out.print("five ");
            break;
        case 6:
            System.out.print("six ");
            break;
        case 7:
            System.out.print("seven ");
            break;
        case 8:
            System.out.print("eight ");
            break;
        case 9:
            System.out.print("nine ");
            break;
        case 0:
            System.out.print("zero ");
            break;
        default:
            System.out.print("InValid ");
            break;
        }
 
           rev = rev / 10;
           }
        }



    public static void main(String[] args) {
        int num = 12345;
        charToNumber(num);
    }
}
