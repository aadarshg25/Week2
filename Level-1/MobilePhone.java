import java.util.Scanner;

class MobilePhoneDetails {
    String brand;
    String model;
    int price;

    // Constructor
    MobilePhoneDetails(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void mobilePhoneStatus() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

class MobilePhone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Brand name: ");
        String brand = input.nextLine();

        System.out.print("Enter the Model: ");
        String model = input.nextLine();

        System.out.print("Enter the Price: ");
        int price = input.nextInt();

        MobilePhoneDetails mPhone = new MobilePhoneDetails(brand, model, price);

        mPhone.mobilePhoneStatus();

        input.close();
    }
}
