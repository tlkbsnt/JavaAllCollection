package bsnt.np.lambda_expression.stream;

import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        ArrayList<Book> books = populateLibrary();
        books.stream().filter(book -> {
            return book.getAuthor().startsWith("T");
        }).filter(book -> {
            return book.getTitle().startsWith("T");
        }).forEach(System.out::println);
    }

    static ArrayList<Book> populateLibrary(){
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Tilak", "Java For Beginner"));
        books.add(new Book("Bhagiram", "Tourism"));
        books.add(new Book("Kali ", "Nepal Yatry"));
        return books;
    }
}
