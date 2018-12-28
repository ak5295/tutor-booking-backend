package com.tutorbooking.core.services.repos;


import com.tutorbooking.core.models.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorRepository extends JpaRepository<Tutor, Long> {

}
