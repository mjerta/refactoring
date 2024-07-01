package nl.novi.assignment3;

public class ConfigurationValidator {
  public boolean validateConfiguration(Config config) {
    if (!isValidNotNull(config)) {
      System.out.println("Config object cannot be null");
      return false;
    }
    if(!isValidUserName(config.getUsername())) {
      System.out.println("Username cannot be null or empty");
      return false;
    }
    if(!isValidPassword(config.getPassword())) {
      System.out.println("Password cannot be null or empty");
      return false;
    }
    if(!isValidURl(config.getUrl())) {
      System.out.println("URL cannot be null or empty");
      return false;
    }
    if (!isValidProtocol(config.getUrl())) {
      System.out.println("Invalid URL: must start with http");
      return false;
    }
    return true;
  }

  private boolean isValidNotNull(Object obj) {
    return obj != null;
  }

  private boolean isValidUserName(String userName) {
    return userName != null && !userName.isEmpty();
  }

  private boolean isValidPassword(String password) {
    return password != null && !password.isEmpty();
  }

  private boolean isValidURl(String url) {
    return url != null && !url.isEmpty();
  }

  private boolean isValidProtocol(String url) {
    return url.startsWith("http");
  }

}