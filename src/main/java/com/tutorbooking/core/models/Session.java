package com.tutorbooking.core.models;

import java.time.Instant;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
public class Session {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "tutor_id")
  private Tutor tutor;
  @ManyToOne
  @JoinColumn(name = "student_id")
  private Student student;

  private Instant startTime;
  private Instant endTime;


  public Session() {
  }
}
