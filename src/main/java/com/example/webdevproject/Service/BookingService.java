package com.example.webdevproject.service;

import com.example.webdevproject.entity.Booking;
import java.util.List;
import java.util.Optional;

public interface BookingService {
    List<Booking> findAll();
    Optional<Booking> findById(Long id);
    Booking save(Booking booking);
    void deleteById(Long id);


}
