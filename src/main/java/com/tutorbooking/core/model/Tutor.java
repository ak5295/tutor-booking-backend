package com.tutorbooking.core.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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

  @JsonIgnore
  @OneToMany
  @JoinColumn(name = "tutor_id", referencedColumnName = "id")
  private List<Session> sessionList;

}
