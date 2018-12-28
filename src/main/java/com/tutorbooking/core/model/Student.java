package com.tutorbooking.core.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
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

}
