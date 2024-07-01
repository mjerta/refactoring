package nl.novi.assignment1;

public class InvoicePrinter {
  public String printInvoice(String customerName, double amount) {
    StringBuilder invoice = new StringBuilder();
    invoice.append(printHeader());
    invoice.append(printDetails(customerName, amount));
    invoice.append(printFooter());
    System.out.println(invoice.toString());
    return  invoice.toString();
  }

  private String printFooter() {
    return printHorizontalLine() + "\nThank you for your business!";
  }

  private String printHorizontalLine() {
    return ("---------");
  }

  private String printDetails(String customerName, double amount) {
    return "\nCustomer: " + customerName + "\nAmount: " + amount + "\n";
  }

  private String printHeader() {
    return "Invoice\n" + printHorizontalLine();
  }

}
