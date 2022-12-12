package com.sheikh;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("st")
@Scope("prototype")
public class Student {

  @Value("Rizwan")
  private String sname;

  @Value("indore")
  private String city;

  @Value("#{addr}") //this is the syntax for collection
  private List<String> address;

  public String getSname() {
    return sname;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public List<String> getAddress() {
    return address;
  }

  public void setAddress(List<String> address) {
    this.address = address;
  }

  public void setSname(String sname) {
    this.sname = sname;
  }

  @Override
  public String toString() {
    return (
      "Student [sname=" +
      sname +
      ", city=" +
      city +
      ", address=" +
      address +
      "]"
    );
  }
}
