package com.tit.week02.day06.encapsulation.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagement {
    public static void main(String[] args) {
        // Create a list of library items
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book("B101", "Java Programming", "John"));
        items.add(new Magazine("M202", "Tech Weekly", "Jane"));
        items.add(new DVD("D303", "Inception", "Christopher Nolan"));

        // Demonstrating polymorphism
        for (LibraryItem item : items) {
            System.out.println("\nItem Details:\n" + item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            // Reserving item if available
            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                if (reservableItem.checkAvailability()) {
                    reservableItem.reserveItem("Alice");
                } else {
                    System.out.println("The item is not available for reservation.");
                }
            }
        }
    }
}

