package nl.novi.assignment4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
  private String title;
  private String author;
  private int publicationYear;

  public Book(String title, String author, int publicationYear) {
    this.title = title;
    this.author = author;
    this.publicationYear = publicationYear;
  }


// Constructor, Getters en Setters
}
