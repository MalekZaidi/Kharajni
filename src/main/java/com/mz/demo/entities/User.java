package com.mz.demo.entities;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;
@Document(collection = "users")
public class User {
    @Id
    private String id;

    @Field("name")
    private String name;

    @Field("email")
    private String email;

    @Field("password")
    @NotEmpty(message = "Password cannot be empty")
    @Size(min = 8, message = "Password must be at least 8 characters long")
    @Pattern.List({
            @Pattern(regexp = "^(?=.*[0-9]).+$", message = "Password must contain at least one digit"),
            @Pattern(regexp = "^(?=.*[A-Z]).+$", message = "Password must contain at least one uppercase letter")
    })
    private String password; // You should encrypt passwords


    @Field("event_ids")
    private List<String> eventIds; // List of event IDs created by the user

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getEventIds() {
        return eventIds;
    }

    public void setEventIds(List<String> eventIds) {
        this.eventIds = eventIds;
    }
    public void encryptPassword() {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        this.password = passwordEncoder.encode(this.password);
    }
}