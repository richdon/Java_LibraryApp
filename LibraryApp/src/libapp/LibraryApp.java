package libapp;

import java.util.ArrayList;

public class LibraryApp {
    private BookRepository bookRepo = new BookRepository();

    public void searchByIsbn(String isbn) {

        System.out.println("Searching for book with ISBN: " + isbn);
        Book book = bookRepo.findByIsbn(isbn);

        if (book != null) {
            System.out.println("1 book found" + "\n\t Title: " + book.getTitle() + "\n\t Author: " + book.getAuthor() +
                    "\n\t Genre: " + book.getGenre() + "" +
                    "\n\t Description: " + book.getDescription());
        } else {
            System.out.println("0 books found.\n");
        }
    }

    public void searchByTitle(String keyword) {
        System.out.println("Searching for book by title: " + keyword);
        ArrayList<Book> books = bookRepo.findByTitle(keyword);
        System.out.printf("%s books found%s", books.size(), books.size() > 0 ? ":" : ".");
        for (Book book : books) {
            System.out.println("\n\t Title: " + book.getTitle() + "\n\t Author: " + book.getAuthor() +
                    "\n\t Genre: " + book.getGenre() + "" +
                    "\n\t Description: " + book.getDescription() + "\n\t_________________");

        }

    }

    public void checkOutBook(String isbn) {
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null) {
            if (book.checkOut()) {
                System.out.println("\nBook checked out successfully.");
            }
            else {
                System.out.println("\nBook not checked out successfully.");
                System.out.println("Reason: There are more books checked out than recorded quantity");
            }
        }
        else {
            System.out.println("Failed to check out book.");
            System.out.printf("Reason: There is no book with that ISBN %s on record.\n", isbn);
        }
    }

        public void checkInBook (String isbn){
            Book book = bookRepo.findByIsbn(isbn);
            if (book != null) {
                book.checkIn();
                System.out.println("\nBook checked in successfully.");
            }
            else {
                System.out.println("Failed to check in book.");
                System.out.printf("Reason: There is no book with that ISBN %s on record.\n", isbn);
            }
        }
    }



