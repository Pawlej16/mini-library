public class Main {
    public static void main(String[] args) {
        
        Book b1 = new Book("Dune", "Frank Herbert", 600, true);
        Book b2 = new Book("Hobbit", "J.R.R. Tolkien", 300, true);
        Book b3 = new Book("1984", "George Orwell", 250, false);

        b1.printInfo();
        b2.printInfo();
        b3.printInfo();

        b1.borrow();
        b1.borrow();
        b1.returnBook();

        System.out.println("------------------------");

        Reader r1 = new Reader("John", "Kowalski", 123, 0);
        Reader r2 = new Reader("Anna", "Smith", 678, 1);

        r1.increaseBorrowedCount();
        r2.decreaseBorrowedCount();

        r1.printData();
        r2.printData();

    }
}