package com.example.webdevproject.repo;

import com.example.webdevproject.entity.BookingEntity;
import jakarta.persistence.criteria.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BookingRepo extends JpaRepository<BookingEntity,Integer> {
}
