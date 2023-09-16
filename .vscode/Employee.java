
public class Employee {
    
    int no;
    String name;
    String country;
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    @Override
    public String toString() {
        return "Employee [no=" + no + ", name=" + name + ", country=" + country + "]";
    }
    public Employee(int no, String name, String country) {
        this.no = no;
        this.name = name;
        this.country = country;
    }

    

}
