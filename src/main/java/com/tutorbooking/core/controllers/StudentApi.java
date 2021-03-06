package com.tutorbooking.core.controllers;

import com.tutorbooking.core.models.Student;
import com.tutorbooking.core.services.repos.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentApi {

  @Autowired private StudentRepository studentRepo;

  @GetMapping("")
  public ResponseEntity<?> getStudents() {
    return new ResponseEntity<>(this.studentRepo.findAll(), HttpStatus.OK);
  }

  @PostMapping("")
  public ResponseEntity<?> createStudent(@RequestBody Student student) {
    return new ResponseEntity<>(this.studentRepo.save(student), HttpStatus.ACCEPTED);
  }

}
