
class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg){
        super("Invalid age: " +msg);
    }
}


public class Voter2 {
    
    public static void main(String[] args) throws Exception{
       try {
        Voter1 v = new Voter1(1, null, 2);
        System.out.println(v.getVoterid());
        System.out.println(v.getName());
        System.out.println(v.getAge());
 
       } catch (Exception e) {
        System.out.println("Invalid age for voter ");
       }
        
    }
}
