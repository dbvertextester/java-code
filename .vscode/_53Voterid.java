 

 
public class _53Voterid {

  
     String name;
    int age;
     int voterid;


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
    public _53Voterid(int voterid, String name, int age) throws  Exception  {
       if( age < 18){
         throw new  Exception("Invalid age for voter");
       }
        this.voterid = voterid;
        this.name = name;
        this.age = age;
    }
    
    public static void main(String[] args) throws  Exception{
     try { 
        _53Voterid voter = new _53Voterid(101, "ram", 22);

     System.out.print( "Voter ID  "+ voter.getVoterid());
     System.out.print( " Voter Name "+voter.getName());
     System.out.print( " Voter Age "+ voter.getAge());
      } catch (Exception e) {
        System.out.print(e.getMessage( ));
     }
    }
}
