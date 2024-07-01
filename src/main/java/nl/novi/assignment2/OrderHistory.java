package nl.novi.assignment2;

import java.util.ArrayList;
import java.util.List;

public class OrderHistory {
  private final static List<Order> orders = new ArrayList<>();

  public double getTotalOrderValue() {
    double total = 0;
    for (Order order : orders) {
      total += order.getValue();
    }
    return total;
  }

  public boolean hasLatePayments() {
    for (Order order : orders) {
      if (order.isLate()) {
        return true;
      }
    }
    return false;
  }

  public void addOrder(Order order) {
    orders.add(order);
  }
}
