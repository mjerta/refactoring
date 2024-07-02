package nl.novi.assignment2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;


public class CustomerTest {

  Customer customer;

  @BeforeEach
  void setUp() {
    customer = new Customer("Maarten","Pietjepukstraat 10");
  }

  @Test
  void canGetTotalOrderValue() {
    // assert
    Date date = new Date(2024 - 1900,5,30);
    customer.addOrder(new Order(50, date));
    // act
    var sut = customer.getTotalorderValue();
    // assert
    assertEquals(50, sut);
  }


  @Test
  void canCheckForLatePaymentsifTrue() {
    // assert
    Date date = new Date(2024 - 1900,5,30);
    Order order = new Order(50, date);
    customer.addOrder(order);
    // act
    var sut = customer.hasLatePayments();
    // assert
    assertTrue(sut);
  }

  @Test
  void canCheckForLatePaymentsifFalse() {
    // assert
    Date date = new Date(2024 - 1900,6,2);
    Order order = new Order(50, date);
    customer.addOrder(order);
    // act
    var sut = customer.hasLatePayments();
    // assert
    assertTrue(!sut);
  }


}
