package com.tutorbooking.core.services;

import com.tutorbooking.core.models.Student;
import com.tutorbooking.core.services.repos.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

  @Autowired
  private StudentRepository studentRepo;
  public Student createStudent(Student student) {
    return this.studentRepo.save(student);
  }
}
