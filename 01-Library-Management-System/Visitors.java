package lesson1;
import java.util.ArrayList;
import java.util.List;

public class Visitors {

    protected String VisitorName;
    protected List<Book> HisBooks = new ArrayList<>();

    public Visitors(String VisitorName){
        this.VisitorName = VisitorName;
    }

    public void Borrow(Book book, Books_Sections section){
        if (book.isBorrowed()){
            System.out.println("Book already borrowed.");
            return;
        }
        if (!section.contains(book)) {
            System.out.println("Book not in this section.");
            return;
        }
        
        section.removebook(book);
        book.setBorrowed(true);
        HisBooks.add(book);
        System.out.println("Book borrowed successfully.");

    }
    public void Put(Book book, Books_Sections section){
        if (!HisBooks.contains(book)){
            System.out.println("You don't have this book");
            return;
        }
        if (HisBooks.contains(book)){
            HisBooks.remove(book);
            book.setBorrowed(false);
            section.addbook(book);

            System.out.println("Book returned successfully.");

        }

    }

}