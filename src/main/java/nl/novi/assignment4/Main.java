package nl.novi.assignment4;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<Book> books = new ArrayList<>();
    books.add(new Book("Harry Potter", "J.K. Rowling", 2004));
    books.add(new Book("The Hobbit", "J.R.R. Tolkien", 1937));
    books.add(new Book("1984", "George Orwell", 1949));
    books.add(new Book("Pride and Prejudice", "Jane Austen", 1813));
    books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
    books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
    books.add(new Book("Moby Dick", "Herman Melville", 1851));
    books.add(new Book("War and Peace", "Leo Tolstoy", 1869));
    books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 1951));
    books.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954));


    Library library = new Library(books);
    var filterOne = library.getBooksByAuthor("Leo Tolstoy");
    library.printOutSearchResults(filterOne);
    var filterTwo = library.getBooksPublishedAfter(2000);
    library.printOutSearchResults(filterTwo);
  }
}
