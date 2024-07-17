package com.mz.demo.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
public class Review {
    @Id
    private String id;
    private String userId;
    private String eventId;
    private String comment;

    // Getters and Setters
}