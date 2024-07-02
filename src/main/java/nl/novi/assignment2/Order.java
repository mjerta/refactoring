package nl.novi.assignment2;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Order {
  private double value;
  private Date date;

  public Order(double value, Date date) {
    this.value = value;
    this.date = date;
  }

  public boolean isLate() {
    Date currentDate = new Date();
    return date.getTime() + 86400000L < currentDate.getTime();
  }
}
