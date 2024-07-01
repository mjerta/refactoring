package nl.novi.assignment2;

import lombok.Getter;

import java.util.Date;

public class Order {
  @Getter
  private double value;
  private final Date date;

  public Order(double value) {
    this.value = value;
    date = new Date();
  }

  public boolean isLate() {
    Date currentDate = new Date();
    return date.getTime() + 86400000L < currentDate.getTime();
  }
}
