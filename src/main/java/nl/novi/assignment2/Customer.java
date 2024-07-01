package nl.novi.assignment2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
  private String name;
  private String address;
  private String phoneNumber;
  private final OrderHistory orderHistory;

  public Customer(String name, String address) {
    this.name = name;
    this.address = address;
    orderHistory = new OrderHistory();
  }

  public double getTotalorderValue() {
    return orderHistory.getTotalOrderValue();
  }

  public boolean hasLatePayments() {
    return orderHistory.hasLatePayments();
  }

  public void addOrder(Order order) {
    orderHistory.addOrder(order);
  }
}
