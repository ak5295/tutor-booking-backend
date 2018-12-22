package com.tutorbooking.core.model;


import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Tutor implements Serializable {
  private Long id;
  private String firstName;
  private String lastName;


}
