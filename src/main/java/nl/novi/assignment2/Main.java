package nl.novi.assignment2;

public class Main {
  public static void main(String[] args) {
    Customer customer = new Customer("Maarten","jandekortestraat 10");
    customer.addOrder(new Order(55));
    customer.addOrder(new Order(55));
    var totalOrdersOfCustomer = customer.getTotalorderValue();
    var isCustomerLateWithPaying = customer.hasLatePayments();
    System.out.println(totalOrdersOfCustomer);
    System.out.println(isCustomerLateWithPaying);
  }
}
