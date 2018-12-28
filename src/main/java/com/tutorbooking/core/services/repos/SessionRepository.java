package com.tutorbooking.core.services.repos;

import com.tutorbooking.core.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SessionRepository extends JpaRepository<Session, Long> {

}
