package lesson1;

public class Main {
    public static void main(String[] args) {

        Books_Sections section1 = new Books_Sections("Action");
        Book book1 = new Book("Book 1");
        Book book2 = new Book("Book Action");
        Book book3 = new Book("Book 3");
        section1.addbook(book1);
        section1.addbook(book2);
        section1.addbook(book3);

        Visitors visitor1 = new Visitors("Visitor 1");
        visitor1.Borrow(book1, section1);
        visitor1.Borrow(book2, section1);
        visitor1.Put(book1, section1);
        visitor1.Put(book3, section1);

        System.out.println("Visitor's borrowed books: " + visitor1.HisBooks);
        System.out.println("Section's available books: " + section1.books.size());

    }
}