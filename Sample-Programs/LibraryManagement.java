class Book {
    static String libraryName = "Manga Art Heritage Tokyo Gallery";

    private String title;
    private String author;

    private final int isbn;

    // Parameterized constructor
    Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Display Library name
    static void displayLibraryName() {
        System.out.println("Name of Library is : " + libraryName);
    }

    // Display Book details
    void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println(
                    title + " is written by " + author + " having isbn number " + isbn);
            System.out.println();
        } else {
            System.out.println("Invalid account!");
        }
    }
}

class LibraryManagement {
    public static void main(String[] args) {
        Book book1 = new Book("One Piece", "Eiichiro Oda", 545);
        Book book2 = new Book("Jujutsu kaisen", "Gege Akutami", 5154);

        Book.displayLibraryName();

        book1.displayBookDetails();
        ;
        book2.displayBookDetails();
        ;

    }
}
