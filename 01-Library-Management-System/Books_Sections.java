package lesson1;
import java.util.ArrayList;
import java.util.List;

public class Books_Sections {

    protected String name;
    protected List<Book> books = new ArrayList<>();
    protected boolean BookAvailability;

    public Books_Sections(String name){
        this.name = name;
    }

    public boolean CheckAvailabilitOfBook(){
        return BookAvailability; // 0 or 1
    }

    public void addbook(Book book){
        books.add(book);
    }
    
    public void removebook(Book book){
        books.remove(book);
    }

    public boolean contains(Book book) {
        return books.contains(book);
    }

}