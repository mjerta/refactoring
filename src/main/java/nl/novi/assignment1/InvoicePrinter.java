package nl.novi.assignment1;

public class InvoicePrinter {
  public void printInvoice(String customerName, double amount) {
    printHeader();
    printDetails(customerName, amount);
    printFooter();
  }

  private void printFooter() {
    printHorizontalLine();
    print("Thank you for your business!");
  }

  private String print(String x) {
    System.out.println(x);
    return x;
  }

  private void printHorizontalLine() {
    print("---------");
  }

  private void printDetails(String customerName, double amount) {
    print("Customer: " + customerName);
    print("Amount: " + amount);
  }

  private void printHeader() {
    print("Invoice");
    printHorizontalLine();
  }

}
