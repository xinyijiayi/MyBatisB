package com.example.demo.bean;

import org.springframework.stereotype.Component;

@Component
public class Admin {

	private String id1;
  private String id;
  private String username;
  private String password;
  private String function;

  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public String getFunction() {
    return function;
  }
  public void setFunction(String function) {
    this.function = function;
  }

  @Override
  public String toString() {
    return "Admin{" +
        "id='" + id + '\'' +
        ", username='" + username + '\'' +
        ", password='" + password + '\'' +
        ", function='" + function + '\'' +
        '}';
  }
}
