package com.tutorbooking.core.controller;

import com.tutorbooking.core.model.Tutor;
import java.util.LinkedList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tutors")
public class TutorApi {

  @GetMapping("")
  public ResponseEntity<?> getTutors() {
    List<Tutor> list = new LinkedList<>();
    list.add(Tutor.builder().id(1L).firstName("John").lastName("Carpenter").build());
    list.add(Tutor.builder().id(2L).firstName("Peter").lastName("Smith").build());

    return new ResponseEntity<>(list, HttpStatus.OK);
  }
}
