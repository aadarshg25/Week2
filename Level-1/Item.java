import java.util.Scanner;

class Inventory {
    private String itemCode;
    private String itemName;
    private double price;

    Inventory(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per item: " + price);
    }

    // total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

class Item {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Item Code: ");
        String itemCode = input.nextLine();

        System.out.print("Enter Item Name: ");
        String itemName = input.nextLine();

        System.out.print("Enter Price per Item: ");
        double price = input.nextDouble();

        Inventory item = new Inventory(itemCode, itemName, price);

        item.displayItemDetails();

        // Get the quantity and calculate the total cost
        System.out.print("Enter Quantity: ");
        int quantity = input.nextInt();

        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total cost for " + quantity + " items: " + totalCost);

        input.close();
    }
}
