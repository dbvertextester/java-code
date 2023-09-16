public class Voter1 {
    int voterid;
    String name;
    int age;
    public Voter1(int voterid, String name, int age) throws Exception {
        if(age < 18){
            throw new  Exception("Invalid age for voter ");
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
 
