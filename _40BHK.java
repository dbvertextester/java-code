  class OneBHK {
    
    double area;

    double roomArea = 100.00;
    double hallArea = 50.00;
    double price = 5000;
  
public OneBHK() {

    }
 
public OneBHK(double area, double roomArea, double hallArea,double price) {
        this.area = area;
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price=price;
    }
 
public void show(){
    System.out.println("One Bhk House");
    System.out.printf("%-23s%8d\n", "Room Area" + roomArea);
    System.out.printf("%-23s%8d\n","Hall Area" + hallArea);
    System.out.println(" OneBhk price "+ price );
}

public static int getPrice() {
    return 5000;
}
 
} 
 class TwoBHK extends OneBHK{

    double room2Area;
    
    double area;
    double roomArea = 200.00;
    double hallArea = 100.00;
    double price = 5000;
 

public TwoBHK() {
    }
 
public TwoBHK(double area, double roomArea, double hallArea,double price) {
       super();
    }
 
public void show(){
    System.out.println("TwoBHK   House");
    System.out.println ( "TwoBHK Room Area" + roomArea);
    System.out.println(" TwoBHK Hall Area" + hallArea);
    System.out.println(" TwoBHK price "+ price );
}
 
}
public class _40BHK  {
         
    public static void main (String[] args){


        TwoBHK t = new TwoBHK();
        OneBHK o = new OneBHK();

        t.show();
         
        System.out.println( " total price " + (OneBHK.getPrice() + TwoBHK.getPrice()));
        
        t.show();
    }

}

