package nl.novi.assignment3;

public class Config {
  private String username;
  private String password;
  private String url;

  public Config(String username, String password, String url) {
    this.username = username;
    this.password = password;
    this.url = url;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getUrl() {
    return url;
  }
}