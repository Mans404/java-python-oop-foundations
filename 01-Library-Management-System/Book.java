package lesson1;
public class Book {
    public String BookName;
    private boolean borrowed;

    public Book(String BookName){
        this.BookName = BookName;
        this.borrowed = false;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book: " + BookName + ", Borrowed: " + borrowed;
    }

    

}