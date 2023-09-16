


package campus.data.campus.academics;

public class Fecalty  extends Person{

    int fecltyId;
    String fecName;
    Double fecSalary;
    String fecBranch;
    public int getFecltyId() {
        return fecltyId;
    }
    public void setFecltyId(int fecltyId) {
        this.fecltyId = fecltyId;
    }
    public String getFecName() {
        return fecName;
    }
    public void setFecName(String fecName) {
        this.fecName = fecName;
    }
    public Double getFecSalary() {
        return fecSalary;
    }
    public void setFecSalary(Double fecSalary) {
        this.fecSalary = fecSalary;
    }
    public String getFecBranch() {
        return fecBranch;
    }
    public void setFecBranch(String fecBranch) {
        this.fecBranch = fecBranch;
    }
    public Fecalty(int fecltyId, String fecName, Double fecSalary, String fecBranch) {
        this.fecltyId = fecltyId;
        this.fecName = fecName;
        this.fecSalary = fecSalary;
        this.fecBranch = fecBranch;
    }

    
}
