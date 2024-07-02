package nl.novi.assignment3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfigurationValidatorTest {
  Config config;

  @BeforeEach
  void setUp() {
    config = new Config("user", "mySecret", "http://localhost:8080");
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void canValidateConfigurationIfTrue() {
    // arrange
    var validationResult = new ConfigurationValidator();
    // act
    var sut = validationResult.validateConfiguration(config);
    // assert
    assertTrue(sut);
  }

  @Test
  void canValidateObjectIfFalse() {
    // arrange
    var validationResult = new ConfigurationValidator();
    // act
    var sut = validationResult.validateConfiguration(null);
    // assert
    assertFalse(sut);
  }

  @Test
  void canValidateUserNameWhenFalse() {
    // arrange
    config = new Config(null, "mySecret", "http://localhost:8080");
    var validationResult = new ConfigurationValidator();
    // act
    var sut = validationResult.validateConfiguration(config);
    // assert
    assertFalse(sut);
  }
  @Test
  void canValidatePasswordWhenFalse() {
    // arrange
    config = new Config("Maarten", null, "http://localhost:8080");
    var validationResult = new ConfigurationValidator();
    // act
    var sut = validationResult.validateConfiguration(config);
    // assert
    assertFalse(sut);
  }
  @Test
  void canValidateUrlWhenFalse() {
    // arrange
    config = new Config("Maarten", "password", null);
    var validationResult = new ConfigurationValidator();
    // act
    var sut = validationResult.validateConfiguration(config);
    // assert
    assertFalse(sut);
  }
  @Test
  void canValidateProtocolWhenFalse() {
    // arrange
    config = new Config("Maarten", "password", "localhost:8080");
    var validationResult = new ConfigurationValidator();
    // act
    var sut = validationResult.validateConfiguration(config);
    // assert
    assertFalse(sut);
  }
}