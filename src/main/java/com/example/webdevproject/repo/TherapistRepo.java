package com.example.webdevproject.repo;

import com.example.webdevproject.entity.TherapistEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TherapistRepo extends JpaRepository<TherapistEntity,Integer> {
}
