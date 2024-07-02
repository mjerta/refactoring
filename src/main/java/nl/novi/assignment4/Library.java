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

  public String printOutSearchResults(List<Book> books) {
    StringBuilder output = new StringBuilder();
    for(Book book: books) {
      var title = book.getTitle();
      var author = book.getAuthor();
      output.append("Title ").append(title).append(" Author: ").append(author).append("\n");
      System.out.println("Title " + title + " Author: " + author);
    }
  return output.toString();
  }

  public List<Book> getBooksByAuthor(String author) {
    return bookFilter.getBooksByAuthor(books, author);
  }

  public List<Book> getBooksPublishedAfter(int year) {
    return bookFilter.getBooksPublishedAfter(books, year);
  }
}
