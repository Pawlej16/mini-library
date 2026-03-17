public class Reader {
    private String firstName;
    private String lastName;
    private int cardNumber;
    private int borrowedCount;

    public Reader(String firstName, String lastName, int cardNumber, int borrowedCount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.borrowedCount = borrowedCount;
    }

    public void printData(){
        System.out.println("Reader: " + firstName + " " + lastName + ".");
        System.out.println("Card number: " + cardNumber);
        System.out.println("Borrowed count: " + borrowedCount);
        System.out.println();
    }

    public void increaseBorrowedCount(){
        borrowedCount++;
    }

    public void decreaseBorrowedCount(){
        if (borrowedCount>0) {
            borrowedCount--;
        }
    }
}