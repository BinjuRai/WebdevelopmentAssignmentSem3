package com.example.webdevproject.Service;


import java.awt.print.Book;

public interface BookingService {
    Integer saveBook(BookingPojo bookingPojo);


    List<BookingProjection> findAll();
    List<Booking> findAll2();

    Book findById(Integer id);

    void deleteById(Integer id);

}
