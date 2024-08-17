package com.example.webdevproject.Service.Impl;

import com.example.webdevproject.Service.TherapistService;
import com.example.webdevproject.pojo.TherapistPojo;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import java.util.List;
import java.util.Optional;

public class TherapistServiceImpl extends TherapistService {
    @Override
    public void saveItem(TherapistPojo therapistPojo) {

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
