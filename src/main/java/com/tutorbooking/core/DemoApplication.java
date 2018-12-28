package com.tutorbooking.core;

import com.tutorbooking.core.models.Student;
import com.tutorbooking.core.services.repos.SessionRepository;
import com.tutorbooking.core.services.repos.StudentRepository;
import com.tutorbooking.core.services.repos.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

  @Autowired
  private TutorRepository tutorRepo;
  @Autowired
  private StudentRepository studentRepo;
  @Autowired
  private SessionRepository sessionRepo;

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Student student = new Student()
        .setFirstName("Lilian")
        .setLastName("Lee");

    this.studentRepo.save(student);
  }
}

