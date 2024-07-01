package nl.novi.assignment3;

public class Main {
  public static void main(String[] args) {
    var config = new Config("user", "mySecret" , "http://localhost:8080");
    var validationResult = new ConfigurationValidator().validateConfiguration(config);
    System.out.println("Config validation resulted in:" + validationResult);
  }
}
