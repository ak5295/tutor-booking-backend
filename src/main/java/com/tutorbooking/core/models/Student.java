package com.tutorbooking.core.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import lombok.Getter;

@Getter
@Entity
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id;

  private String firstName;
  private String lastName;

  @JsonIgnore
  @OneToMany
  @JoinColumn(name = "student_id", referencedColumnName = "id")
  private List<Session> sessionList;

  public Student() {
  }

  public Student setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public Student setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public Student setSessionList(List<Session> sessionList) {
    this.sessionList = sessionList;
    return this;
  }
}
