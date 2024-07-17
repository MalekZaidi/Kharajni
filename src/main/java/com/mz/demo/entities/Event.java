package com.mz.demo.entities;

import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "users")
@Getter
@ToString
@Setter
public class Event {
    @Id
    private String id;
    private String userId; // ID of the user who created the event
    private EventType type;
    private String description;
    private List<String> reviewIds; // List of review IDs for comments and suggestions

}
