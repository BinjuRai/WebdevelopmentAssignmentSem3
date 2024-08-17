package com.example.webdevproject.Service;

import com.example.webdevproject.pojo.FeedbackPojo;
import com.example.webdevproject.pojo.TherapistPojo;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import java.util.List;
import java.util.Optional;

public interface TherapistService {
    void saveItem(TherapistPojo therapistPojo);

    List<AbstractReadWriteAccess.Item> findAll();

    Optional<AbstractReadWriteAccess.Item> findById(Integer id);

    void deleteById(Integer id);
}
