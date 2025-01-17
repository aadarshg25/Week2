import java.util.Scanner;

class Cart {
    String itemName;
    int price;
    int quantity;
    String[][] cart; // 2D array to store cart items (itemName, price, quantity)
    int itemCount; // To keep track of the number of items added

    // Constructor to initialize cart
    public Cart(int maxItems) {
        cart = new String[maxItems][3]; // Each item has 3 properties: itemName, price, and quantity
        itemCount = 0; // Initialize item count to 0
    }

    // Method to add an item to the cart
    public void addItem(String itemName, int price, int quantity) {
        if (itemCount < cart.length) {
            cart[itemCount][0] = itemName;
            cart[itemCount][1] = String.valueOf(price);
            cart[itemCount][2] = String.valueOf(quantity);
            itemCount++; // Increment the item count
            System.out.println(itemName + " has been added to the cart.");
        } else {
            System.out.println("Cart is full. Cannot add more items.");
        }
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        boolean found = false;
        for (int i = 0; i < itemCount; i++) {
            if (cart[i][0].equalsIgnoreCase(itemName)) {
                // Shift items to the left after removing the item
                for (int j = i; j < itemCount - 1; j++) {
                    cart[j] = cart[j + 1];
                }
                cart[itemCount - 1] = null; // Nullify the last item
                itemCount--; // Decrease the item count
                System.out.println(itemName + " has been removed from the cart.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(itemName + " not found in the cart.");
        }
    }

    // Method to display the total cost of the cart
    public void displayCartCost() {
        if (itemCount == 0) {
            System.out.println("Your cart is empty.");
            return;
        }

        int totalCost = 0;
        System.out.println("\nItems in your cart:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println("Item: " + cart[i][0] + ", Price: Rs. " + cart[i][1] + ", Quantity: " + cart[i][2]);
            totalCost += Integer.parseInt(cart[i][1]) * Integer.parseInt(cart[i][2]);
        }
        System.out.println("Total Cost: Rs. " + totalCost);
    }
}

public class CartItem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the maximum number of items your cart can hold: ");
        int maxItems = input.nextInt();
        Cart cart = new Cart(maxItems);

        while (true) {
            System.out.print("\nDo you want to Add an Item to Cart (y/n)? ");
            char response = input.next().toLowerCase().charAt(0);

            if (response == 'y') {
                System.out.print("Enter the Item Name: ");
                String itemName = input.next();

                System.out.print("Enter the Price of Item: ");
                int price = input.nextInt();

                System.out.print("Enter the Quantity of Item: ");
                int quantity = input.nextInt();

                cart.addItem(itemName, price, quantity);
            } else if (response == 'n') {
                break;
            }

            // Ask the user if they want to remove an item
            System.out.print("\nDo you want to Remove an Item from Cart (y/n)? ");
            char removeResponse = input.next().toLowerCase().charAt(0);
            if (removeResponse == 'y') {
                System.out.print("Enter the name of the item to remove: ");
                String removeItemName = input.next();
                cart.removeItem(removeItemName);
            }

            // Display the cart details
            cart.displayCartCost();

        }

        input.close();
    }
}
