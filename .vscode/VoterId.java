
class InvalidAgeException extends Exception {
    public InvalidAgeException (String massage){
        super(massage);
    }
} 
 class Voter {
     
    int voterid;
    String name;
    int age;
    public Voter(int voterid, String name, int age) throws Exception {
        if(age < 18){
            throw new InvalidAgeException("Invalid age for voter ");
        }
        this.voterid = voterid;
        this.name = name;
        this.age = age;
    }
    public void getVoterid(int num){
        
    }

    public int getVoterid() {
        return voterid;
    }
    public void setVoterid(int voterid) {
        this.voterid = voterid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "VoterId [voterid=" + voterid + ", name=" + name + ", age=" + age + "]";
    }
 }
    public class VoterId{
    public static void main(String[] args) throws Exception  {
        try {
            Voter voter = new  Voter(101, "Ram", 22) ;
            // System.out.println(VoterId.getVoterid);
            System.out.println(voter.getVoterid());
            System.out.println(voter.getName());
            System.out.println(voter.getAge());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    
}
