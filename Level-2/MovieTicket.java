import java.util.Scanner;

class MovieTicketBooking {
    private String movieName;
    private int[] hall;
    private int price;

    // Constructor
    MovieTicketBooking(String movieName, int totalSeats, int price) {
        this.movieName = movieName;
        this.hall = new int[totalSeats]; // Initialize hall with total seats
        this.price = price;
    }

    // Method to book a seat
    public void bookSeat(int seat) {
        if (seat < 1 || seat > hall.length) {
            System.out.println("Invalid seat number. Please choose a seat between 1 and " + hall.length);
            return;
        }
        if (hall[seat - 1] == 0) { // 0 signifies Ticket Not Booked
            hall[seat - 1] = 1;
            System.out.println("Seat " + seat + " booked successfully for movie \"" + movieName + "\" at Rs. " + price);
        } else {
            System.out.println("Seat " + seat + " is already booked. Please choose a different seat.");
        }
    }

    // Method to display the status of seats
    public void displayStatus() {
        System.out.println("\nBooking Status for Movie: \"" + movieName + "\"");
        for (int i = 0; i < hall.length; i++) {
            if (hall[i] == 1) {
                System.out.println("Seat " + (i + 1) + ": BOOKED");
            } else {
                System.out.println("Seat " + (i + 1) + ": AVAILABLE");
            }
        }
    }
}

public class MovieTicket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input movie details
        System.out.print("Enter the Movie Name: ");
        String movieName = input.nextLine();

        System.out.print("Enter the Total Number of Seats: ");
        int totalSeats = input.nextInt();

        System.out.print("Enter the Price of a Movie Ticket: ");
        int price = input.nextInt();

        MovieTicketBooking ticketSystem = new MovieTicketBooking(movieName, totalSeats, price);

        // Booking process
        System.out.print("Do you want to book a ticket? (y/n): ");
        char response = input.next().toLowerCase().charAt(0);

        if (response == 'y') {
            System.out.print("How many tickets do you want to book? ");
            int numberOfTickets = input.nextInt();

            for (int i = 0; i < numberOfTickets; i++) {
                System.out.print("Enter the Seat Number you want (1-" + totalSeats + "): ");
                int seatNumber = input.nextInt();
                ticketSystem.bookSeat(seatNumber);
            }
        }

        // Display booking status
        ticketSystem.displayStatus();

        input.close();
    }
}
