class Product {

    static double discount = 10.0;

    private String productName;
    private double price;
    private int quantity;

    private final String productID;

    // Parameterized constructor
    Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Static method to update the discount percentage
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("\nProduct Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Product ID: " + productID);
            System.out.println("Discount: " + discount + "%");
            System.out.println();
        } else {
            System.out.println("Invalid product.");
        }
    }

}

class ShoppingCart {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1000.0, 2, "P001");
        Product p2 = new Product("Phone", 500.0, 5, "P002");

        p1.displayProductDetails();
        p2.displayProductDetails();

        Product.updateDiscount(15.0);
        System.out.println("\nProducts after Updating Discount...");
        p1.displayProductDetails();
        p2.displayProductDetails();
    }
}