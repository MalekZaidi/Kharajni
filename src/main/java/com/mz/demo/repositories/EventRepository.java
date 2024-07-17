package com.mz.demo.repositories;

import com.mz.demo.entities.Event;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventRepository extends MongoRepository<Event,String> {
}
