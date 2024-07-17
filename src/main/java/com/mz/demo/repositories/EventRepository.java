package com.mz.demo.repositories;

import com.mz.demo.entities.Event;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EventRepository extends MongoRepository<Event,String> {
    List<Event> findEventById(String id);
}
