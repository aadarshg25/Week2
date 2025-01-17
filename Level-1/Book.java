import java.util.Scanner;

class Book {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of Author: ");
        String author = input.nextLine();

        System.out.print("Enter the title of Book: ");
        String title = input.nextLine();

        System.out.print("Enter the price of Book: ");
        int price = input.nextInt();

        BookDetails book = new BookDetails(title, author, price);

        book.displayBookStatus();

        input.close();
    }
}

class BookDetails {
    String title;
    String author;
    int price;

    BookDetails(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayBookStatus() {
        System.out.println(title + " is written by " + author + " and costs " + price + " units.");
    }
}
