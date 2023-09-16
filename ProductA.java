import java.util.Scanner;

public class ProductA {
    private int pid;
    private double price;
    private int quantity;

    public ProductA(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
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


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of products
        ProductA[] products = new ProductA[2];

        // Accept five product information from the user
        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter product name: ");
            int name = scanner.nextInt();

            System.out.println("Enter product price: ");
            double price = scanner.nextDouble();

            System.out.println("Enter product quantity: ");
            int quantity = scanner.nextInt();

            // Create a product object and add it to the array
            products[i] = new ProductA(name, price, quantity);
        }

        // Find the product with the highest price
        ProductA productWithHighestPrice = products[0];
        for (int i = 1; i < products.length; i++) {
            if (products[i].getPrice() > productWithHighestPrice.getPrice()) {
                productWithHighestPrice = products[i];
            }
             System.out.println(productWithHighestPrice);
        }

        // Print the product with the highest price
        System.out.println(productWithHighestPrice);
    }
}