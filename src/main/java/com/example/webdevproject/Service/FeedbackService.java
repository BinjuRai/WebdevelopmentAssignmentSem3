package com.example.webdevproject.Service;

import com.example.webdevproject.pojo.FeedbackPojo;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import java.util.List;
import java.util.Optional;

public interface FeedbackService {
    void saveItem(FeedbackPojo feedbackPojo);

    List<AbstractReadWriteAccess.Item> findAll();

    Optional<AbstractReadWriteAccess.Item> findById(Integer id);

    void deleteById(Integer id);
}
