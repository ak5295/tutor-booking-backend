package com.tutorbooking.core.model;

import java.time.Instant;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;
import org.omg.CORBA.PRIVATE_MEMBER;

@Builder
@Data
@Entity
public class Session {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id;

  @ManyToOne
  private Tutor tutor;
  @ManyToOne
  private Student student;

  private Instant startTime;
  private Instant endTime;

}
