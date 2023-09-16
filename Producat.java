
class Product {

	// Member variables
	// Product ID
	int pro_Id;
	// Product name
	String pro_name;

	// Constructor
	Product(int pid, String n)
	{
		pro_Id = pid;
		pro_name = n;
	}

	// Method of this class
	public void display()
	{

		// Print and display the productID and product name
		System.out.print("Product Id = " + pro_Id + " "
						+ " Product Name = " + pro_name);

		System.out.println();
	}
}

// Class 2
// Main class
public class Producat {

	// Main driver method
	public static void main(String args[])
	{

		// Creating an array of product object, or simply
		// creating array of object of class 1
		Product[] obj = new Product[5];

		 
		obj[0] = new Product(23907, "Hp Omen Gaming 15");
		obj[1] = new Product(91240, "Dell G3 Gaming");
		obj[2] = new Product(29823, "Asus TUF Gaming");
		obj[3] = new Product(11908, "Lenovo Legion Gaming");
		obj[4] = new Product(43590, "Acer Predator Gaming");

		// Lastly displaying the product object data
		System.out.println("Product Object 1:");
		obj[0].display();

		System.out.println("Product Object 2:");
		obj[1].display();

		System.out.println("Product Object 3:");
		obj[2].display();

		System.out.println("Product Object 4:");
		obj[3].display();

		System.out.println("Product Object 5:");
		obj[4].display();
	}
}
