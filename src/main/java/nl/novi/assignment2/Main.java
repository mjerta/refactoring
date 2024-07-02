package nl.novi.assignment2;

import java.util.Date;

public class Main {
  public static void main(String[] args) {
    Customer customer = new Customer("Maarten","jandekortestraat 10");
    Date date = new Date(2024,6,30);
    customer.addOrder(new Order(55, date));
    customer.addOrder(new Order(55, date));
    var totalOrdersOfCustomer = customer.getTotalorderValue();
    var isCustomerLateWithPaying = customer.hasLatePayments();
    System.out.println(totalOrdersOfCustomer);
    System.out.println(isCustomerLateWithPaying);
  }
}
