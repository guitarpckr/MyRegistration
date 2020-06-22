package com.tts.myRegistration.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Subscriber {
  
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  private String firstName;
  private String lastName;
  private String username;
  
  @CreationTimestamp
  @Column
  private Date signupDate;
  
  public Subscriber() {}

  public Subscriber(String firstName, String lastName,
      String username, Date signupDate) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.signupDate = signupDate;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Date getSignupDate() {
    return signupDate;
  }

  public void setSignupDate(Date signupDate) {
    this.signupDate = signupDate;
  }

  public Long getId() {
    return id;
  }

  @Override
  public String toString() {
    return "Subscriber [id=" + id + ", firstName="
        + firstName + ", lastName=" + lastName
        + ", username=" + username + ", signupDate="
        + signupDate + "]";
  }

}