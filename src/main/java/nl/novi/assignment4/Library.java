package nl.novi.assignment4;

import java.util.ArrayList;
import java.util.List;

public class Library {
  private final List<Book> books;
  private final BookFilter bookFilter;

  public Library(List<Book> books) {
    this.books = books;
    this.bookFilter = new BookFilter();
  }

  public void printOutSearchResults(List<Book> books) {
    for(Book book: books) {
      var title = book.getTitle();
      var author = book.getAuthor();
      System.out.println("Title " + title + " Author: " + author);
    }

  }

  public List<Book> getBooksByAuthor(String author) {
    return bookFilter.getBooksByAuthor(books, author);
  }

  public List<Book> getBooksPublishedAfter(int year) {
    return bookFilter.getBooksPublishedAfter(books, year);
  }
}
