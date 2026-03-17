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
    }
}