import java.util.Scanner;
// Create class Product (pid, price, quantity) with parameterized constructor.
class Product {

    int pid;
    double price;
    int quantity;


    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}

class XYZ {

    public double calculateTotalAmount(Product[] products) {
        double totalAmount = 0;
        for (Product product : products) {
            totalAmount += product.price * product.quantity;
        }
        return totalAmount;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5]; // Array to store 5 products


        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("Product ID: ");
            int pid = scanner.nextInt();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();


            products[i] = new Product(pid, price, quantity);
        }


        double maxPrice = products[0].price;
        int maxPricePid = products[0].pid;
        for (int i = 1; i < products.length; i++) {
            if (products[i].price > maxPrice) {
                maxPrice = products[i].price;
                maxPricePid = products[i].pid;
            }
        }
        System.out.println("The product with the highest price has PID: " + maxPricePid);


        XYZ xyz = new XYZ();
        double totalAmountSpent = xyz.calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmountSpent);

    }
}
