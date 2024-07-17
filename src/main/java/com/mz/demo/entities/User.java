package com.mz.demo.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document(collection = "users")

public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    private List<String> eventIds;
}
