package org.example;

public class App {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library("City Public Library");

        // Create some books
        Book book1 = new Book("Java Programming", "John Smith", "ISBN-001");
        Book book2 = new Book("Object-Oriented Design", "Jane Doe", "ISBN-002");
        
        // Add books to library
        library.addBook(book1);
        library.addBook(book2);

        // Create patrons
        Patron patron1 = new Patron("Alice", "alice@email.com");
        Patron patron2 = new Patron("Bob", "bob@email.com");

        // Register patrons
        library.registerPatron(patron1);
        library.registerPatron(patron2);

        // Simulate book borrowing
        patron1.borrowBook(book1);
        patron2.borrowBook(book2);

        // Print library state
        System.out.println("Available Books: " + library.getAvailableBooks());
        System.out.println("Alice's Borrowed Books: " + patron1.getBorrowedBooks());
    }
}