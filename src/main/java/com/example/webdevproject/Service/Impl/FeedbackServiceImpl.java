package com.example.webdevproject.Service.Impl;

import com.example.webdevproject.Service.FeedbackService;
import com.example.webdevproject.pojo.FeedbackPojo;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import java.util.List;
import java.util.Optional;

public class FeedbackServiceImpl extends FeedbackService {
    @Override
    public void saveItem(FeedbackPojo feedbackPojo) {

    }

    @Override
    public List<AbstractReadWriteAccess.Item> findAll() {
        return List.of();
    }

    @Override
    public Optional<AbstractReadWriteAccess.Item> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Integer id) {

    }
}
