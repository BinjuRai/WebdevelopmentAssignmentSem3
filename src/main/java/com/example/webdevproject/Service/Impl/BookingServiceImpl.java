package com.example.webdevproject.Service.Impl;

import com.example.webdevproject.Service.BookingService;
import com.example.webdevproject.entity.User;
import com.example.webdevproject.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.awt.print.Book;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {
    private final BookingRepo bookingRepo;
    private final UserRepo userRepo;

    @Override
    public Integer saveBook(BookingPojo bookingPojo) {
        Book book = new Book();

        book.setId(bookingPojo.getId());
        book.setDate(bookingPojo.getDate());

        User user = user.findById(bookingPojo.getUser_id()).get();
        book.setUser(user);

        book=bookingRepo.save(book);
        return book.getId();
    }

    @Override
    public List<BookingProjection> findAll() {
        return bookingRepo.findAllData();
    }

    @Override
    public List<Booking> findAll2() {
        return bookingRepo.findAll();
    }

    @Override
    public Book findById(Integer id) {
        return bookingRepo.findById(id).get();
    }

    @Override
    public void deleteById(Integer id) {
        bookingRepo.deleteById(id);

    }
}
