package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    // Private attributes for encapsulation
    private String name;
    private List<Book> books;
    private List<Patron> patrons;

    // Constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    // Method to add a book
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to register a patron
    public void registerPatron(Patron patron) {
        patrons.add(patron);
    }

    // Method to find a book by ISBN
    public Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    // Method to find a patron by name
    public Patron findPatronByName(String name) {
        for (Patron patron : patrons) {
            if (patron.getName().equals(name)) {
                return patron;
            }
        }
        return null;
    }

    // Method to list all available books
    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    // Getter for library name
    public String getName() {
        return name;
    }
}
