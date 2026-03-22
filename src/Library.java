public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }

    public void addBook (Book book){
        if (bookCount < books.length){
            books[bookCount] = book;
            bookCount ++;
        }
        else {
            System.out.println("There is no room for the book.");
        }
    }

    public void printAvailableBooks(){
        System.out.println("Available books:");
        for (int i=0; i<bookCount; i++){
            if (books[i].isAvailable()) {
                books[i].printInfo();
            }
        }
    }

    public Book findBookByTitle(String title){
        for(int i=0; i<bookCount; i++){
            if(books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public int countAvailableBooks(){
        int availableCount = 0;
        for(int i=0; i<bookCount; i++) {
            if (books[i].isAvailable()) {
                availableCount ++;
            }
        }
        return availableCount;
    }

    public void borrowBook(String title, Reader reader){
        Book book = findBookByTitle(title);

        if (book == null) {
            System.out.println("Couldn't find the book title!");
            return;
        }

        if (!book.isAvailable()) {
            System.out.println("Book already borrowed!");
            return;
        }

        book.borrow();
        reader.increaseBorrowedCount();

        System.out.println(reader.getFullName() + "borrowed the book ,," + title + "''.");
    }
    public void returnBook(String title, Reader reader) {
        Book book = findBookByTitle(title);

        if (book == null) {
            System.out.println("Couldn't find the book: " + title);
            return;
        }

        if (book.isAvailable()) {
            System.out.println("This book is already in library!");
            return;
        }

        book.returnBook();
        reader.decreaseBorrowedCount();

        System.out.println(reader.getFullName() + " returned the book ,," + title + "''.");
    }

}