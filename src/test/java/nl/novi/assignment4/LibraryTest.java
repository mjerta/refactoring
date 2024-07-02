package nl.novi.assignment4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
  List<Book> books = new ArrayList<>();
  Library library;

  @BeforeEach
  void setUp() {
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

    library = new Library(books);

  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void canprintOutSearchResults() {
    // arrange
    StringBuilder output = new StringBuilder();
    for (Book book : books) {
      var title = book.getTitle();
      var author = book.getAuthor();
      output.append("Title ").append(title).append(" Author: ").append(author).append("\n");
    }
    // act
    var sut = library.printOutSearchResults(books);
    // assert
    assertEquals(output.toString(), sut);

  }

  @Test
  void canGetBooksByAuthor() {
    // arrange
    var nameOfAuthor = "J.K. Rowling";
    List<Book> testList = new ArrayList<>();
    testList.add(new Book("Harry Potter", "J.K. Rowling", 2004));
    // act
    var sut = library.getBooksByAuthor(nameOfAuthor);
    assertEquals(testList.size(), sut.size());
    // Manual comparison
    for (int i = 0; i < testList.size(); i++) {
      Book expected = testList.get(i);
      Book actual = sut.get(i);
      assertEquals(expected.getTitle(), actual.getTitle(), "Title mismatch at index " + i);
      assertEquals(expected.getAuthor(), actual.getAuthor(), "Author mismatch at index " + i);
      assertEquals(expected.getPublicationYear(), actual.getPublicationYear(), "Year mismatch at index " + i);
    }
  }

  @Test
  void getBooksPublishedAfter() {
    // arrange
    var year = 2003;
    List<Book> testList = new ArrayList<>();
    testList.add(new Book("Harry Potter", "J.K. Rowling", 2004));
    // act
    var sut = library.getBooksPublishedAfter(year);
    // assert
    assertEquals(testList.size(), sut.size());
    // Manual comparison
    for (int i = 0; i < testList.size(); i++) {
      Book expected = testList.get(i);
      Book actual = sut.get(i);
      assertEquals(expected.getTitle(), actual.getTitle(), "Title mismatch at index " + i);
      assertEquals(expected.getAuthor(), actual.getAuthor(), "Author mismatch at index " + i);
      assertEquals(expected.getPublicationYear(), actual.getPublicationYear(), "Year mismatch at index " + i);
    }
  }
}