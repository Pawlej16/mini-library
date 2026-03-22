public class Main {
    public static void main(String[] args) {

        Library library = new Library(10);

        Book b1 = new Book("Dune", "Frank Herbert", 500, true);
        Book b2 = new Book("Hobbit", "J.R.R. Tolkien", 300, true);
        Book b3 = new Book("Metro 2033", "Dmitry Glukhovsky", 450, true);

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        Reader r1 = new Reader("Antony", "Matheus", 123, 0);

        System.out.println("=== Before borrowing ===");
        library.printAvailableBooks();

        library.borrowBook("Hobbit", r1);

        System.out.println("=== After borrowing ===");
        library.printAvailableBooks();

        library.returnBook("Hobbit", r1);

        System.out.println("=== After returning ===");
        library.printAvailableBooks();
    }
}