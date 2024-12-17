package org.example;

import java.util.ArrayList;
import java.util.List;

public class Patron {
    // Private attributes for encapsulation
    private String name;
    private String contactInfo;
    private List<Book> borrowedBooks;

    // Constructor
    public Patron(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    // Method to borrow a book
    public boolean borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrow();
            borrowedBooks.add(book);
            return true;
        }
        return false;
    }

    // Method to return a book
    public boolean returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
            return true;
        }
        return false;
    }

    // Get borrowed books
    public List<Book> getBorrowedBooks() {
        return new ArrayList<>(borrowedBooks);
    }
}