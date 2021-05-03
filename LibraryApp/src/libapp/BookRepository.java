package libapp;

import java.util.ArrayList;
import java.util.Locale;

public class BookRepository {
    private ArrayList<Book> books = new ArrayList<Book>();

    public BookRepository() {
        books.add(new Book("83412", "Learn Java", "Textbook",
                null, "Marc Loy", 10, 2));
        books.add(new Book("72347", "Learn Python", "Textbook",
                null, "John Foo", 15, 10));
        books.add(new Book("60012", "Learn C++", "Textbook",
                null, "Jane Doe", 8, 4));
    }
    public Book findByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }

        }
        return null;
    }

    public ArrayList<Book> findByTitle(String keyword) {
        ArrayList<Book> booksFound = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                booksFound.add(book);
            }
        }
        return booksFound;
    }

}