// Book.java (Already existing, but I'll show a complete implementation)
package org.example;

public class Book {
    // Private attributes to ensure encapsulation
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    // Constructor with all parameters
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    // Getter methods (Encapsulation)
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Method to mark book as borrowed
    public void borrow() {
        if (isAvailable) {
            isAvailable = false;
        }
    }

    // Method to return book
    public void returnBook() {
        isAvailable = true;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", available=" + isAvailable +
                '}';
    }
}

