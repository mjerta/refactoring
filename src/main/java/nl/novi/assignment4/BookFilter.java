package nl.novi.assignment4;

import java.util.ArrayList;
import java.util.List;

public class BookFilter {

  public List<Book> getBooksByAuthor(List<Book> books ,String author) {
    List<Book> result = new ArrayList<>();
    for (Book book : books) {
      if (book.getAuthor().equals(author)) {
        result.add(book);
      }
    }
    return result;
  }

  public List<Book> getBooksPublishedAfter(List<Book> books,int year) {
    List<Book> result = new ArrayList<>();
    for (Book book : books) {
      if (book.getPublicationYear() > year) {
        result.add(book);
      }
    }
    return result;
  }
}
