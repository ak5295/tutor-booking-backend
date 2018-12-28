package com.tutorbooking.core.services;

import com.tutorbooking.core.services.repos.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TutorService {


  @Autowired
  private TutorRepository tutorRepo;

}
