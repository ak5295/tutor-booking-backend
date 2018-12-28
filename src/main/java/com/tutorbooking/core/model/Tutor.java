package com.tutorbooking.core.model;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@Entity
public class Tutor implements Serializable {

  @Id
  private Long id;
  private String firstName;
  private String lastName;


}
