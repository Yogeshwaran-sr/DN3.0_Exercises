package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("B001", "Java Programming", "jaden Smith"));
        books.add(new Book("B002", "Data Structures", "wee"));
        books.add(new Book("B003", "Algorithms", "vigran"));

        Collections.sort(books, Comparator.comparing(Book::getTitle));

        LibraryManager manager = new LibraryManager();

        System.out.println("Linear Search:");
        Book book = manager.searchBookByTitleLinear(books, "Data Structures");
        System.out.println(book != null ? book : "Book not found.");

        System.out.println("\nBinary Search:");
        book = manager.searchBookByTitleBinary(books, "Data Structures");
        System.out.println(book != null ? book : "Book not found.");
    }
}
