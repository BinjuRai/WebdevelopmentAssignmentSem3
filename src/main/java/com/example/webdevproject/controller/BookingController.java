package com.example.webdevproject.controller;

import com.example.webdevproject.Service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;

@RequestMapping("/booking")
@RestController
@RequiredArgsConstructor
public class BookingController {

    private final BookingService bookingService;

    @GetMapping("/list")
    public List<BookingProjection> findAll() {
        return this.bookingService.findAll();
    }


    @GetMapping("/list2")
    public List<Book> findAll2() {
        return this.bookingService.findAll2();
    }


    @PostMapping("/save")
    public GlobalApiResponse<Integer> saveBook(@RequestBody @Valid BookPojo bookPojo) {
        GlobalApiResponse<Integer> globalApiResponse = new GlobalApiResponse<>();
        Integer bookId = bookService.saveBook(bookPojo);
        globalApiResponse.setData(bookId);
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("data saved successfully");

        return globalApiResponse;
    }


    @PutMapping("/update")
    public void bookUpdate(@RequestBody BookPojo bookPojo) {
        bookingService.saveBook(bookPojo);
    }


    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        bookingService.deleteById(id);
    }

    @GetMapping("/getById/{id}")
    public Book findById(@PathVariable Integer id) {
        return this.bookingService.findById(id);
    }

}
