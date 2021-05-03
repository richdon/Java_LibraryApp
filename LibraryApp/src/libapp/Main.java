package libapp;

public class Main {

    public static void main(String[] args) {
        LibraryApp app = new LibraryApp();
        app.searchByIsbn("60012");

        app.searchByTitle("LEARN");

        app.searchByTitle("bagel");

        app.checkOutBook("60012");
        app.checkOutBook("87564");
        app.checkOutBook("60012");
        app.checkOutBook("60012");
        app.checkOutBook("60012");
        app.checkOutBook("60012");
        app.checkInBook("60012");
        app.checkOutBook("60012");
        app.checkOutBook("60012");

    }
}
