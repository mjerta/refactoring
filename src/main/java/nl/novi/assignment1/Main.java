package nl.novi.assignment1;

import nl.novi.assignment2.Customer;
import nl.novi.assignment2.Order;

public class Main {
  public static void main(String[] args) {
    InvoicePrinter newinvoice = new InvoicePrinter();
    newinvoice.printInvoice("Maarten", 55);
  }
}