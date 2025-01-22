import java.util.ArrayList;

class Library {
    private ArrayList<Book> books;

    // Constructor to initialize the library
    public Library() {
        this.books = new ArrayList<>();
    }

    // add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // display all books in the library
    public void displayLibrary() {
        System.out.println("\nLibrary contains the following books:");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}

class Book {
    private String title;
    private String author;

    // Constructor to initialize book details
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter methods for book properties
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("\nBook Title: " + title);
        System.out.println("Book Author: " + author);
    }
}

class LibraryManagement {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("One Piece", "Eiichiro Oda");
        Book book2 = new Book("Effective Java", "Joshua Bloch");
        Book book3 = new Book("The Jungle Book", "Rudyard Kipling");

        // Create libraries
        Library library1 = new Library();
        Library library2 = new Library();

        // Add books to libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book3);

        // Display library contents
        library1.displayLibrary();
        library2.displayLibrary();

        // Display individual book details
        book1.displayBookDetails();
    }
}
