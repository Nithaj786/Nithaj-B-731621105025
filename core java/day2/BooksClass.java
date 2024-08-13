package nithaj;

import java.util.*;
import java.lang.*;

class Book {
    private String title;
    private String author;
    private String isbn;

    
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}

class BC {
    private ArrayList<Book> books;

    
     BC() {
        this.books = new ArrayList<>();
    }

     void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String isbn) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getIsbn().equals(isbn)) {
            	
                iterator.remove();
                System.out.println("Book removed: " + book);
            }
        }
        System.out.println("Book not found with ISBN: " + isbn);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in list...");
        } else {
            System.out.println("Books are:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}

 class BooksClass {
    public static void main(String[] args) {
        BC coll = new BC();

        Book book1 = new Book("Path of NP ", "Nithaj ", "12345");
        Book book2 = new Book("Way of Middle Class ", "Nithaj ", "12356");

        coll.addBook(book1);
        coll.addBook(book2);

        coll.displayBooks();

        coll.removeBook("12345");

        coll.displayBooks();
    }
}