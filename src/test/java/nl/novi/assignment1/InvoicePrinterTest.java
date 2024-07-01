package nl.novi.assignment1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoicePrinterTest {
  InvoicePrinter invoicePrinter;

  @Test
  void canPrintInvoice() {
    // arrange
    InvoicePrinter invoicePrinter = new InvoicePrinter();
    // assert
    var sut = invoicePrinter.printInvoice("John Doe", 123.45);
    var expected = "Invoice\n" +
      "---------\n" +
      "Customer: John Doe\n" +
      "Amount: 123.45\n" +
      "---------\n" +
      "Thank you for your business!";
    // act
    assertEquals(expected, sut);

  }

}