import java.util.Scanner;

class ProductS {

    int pid;
    double price;
    int quantity;

    ProductS (int pid, double price, int quantity){
        this.pid = pid;
        this.price=price;
        this.quantity = quantity;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}



public class _36Product {

    public static void main(String[] args) throws Exception{
        
        Scanner  sc = new Scanner(System.in);
        ProductS[] products = new ProductS[2];

        for(int i=0; i < products.length; i++){
        System.out.print("Enter the   product ID : ");
        int  name = sc.nextInt();

        System.out.print(" Enter the product price : ");
        Double price =sc.nextDouble ();

        System.out.print("Enter the product quantity : ");
        Integer qnty = sc.nextInt();

        products[i]= new ProductS(name, price, qnty);

        }

        ProductS HighestPrice = products[0];
         double singleProduct = 0;
       for (int i = 1; i < products.length; i++) {

      //  single product=price of product * quantity of product)
          

           singleProduct += products[i].getPrice() * products[i].getQuantity(); 

                if ((products[i].getPrice()) > (HighestPrice.getPrice())) {
                    HighestPrice = products[i];
                }
     
    }
    System.out.println(singleProduct);
    System.out.println("The highest Price is "+ HighestPrice.getPrice());
    sc.close();
}


}
