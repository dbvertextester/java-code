package _41Facalty;

public class FacalatyDtls {
     
    public static void main(String[] args) {
        
        Fulltime f1 = new Fulltime(101,1000, 500);
        Fulltime f2 = new Fulltime(102,2000, 1000);

        Parttime p1 = new Parttime(201,5, 500);
        Parttime p2 = new Parttime(202,3, 550 );

        p1.display();
        p2.display();

        f1.display();
        f2.display();
    }
}
