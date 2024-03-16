package com.personal.producer.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.personal.producer.models.UserRequest;
import com.personal.producer.producers.UserProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("user")
public class UserController {


    private final UserProducer userProducer;

    public UserController(UserProducer userProducer) {

        this.userProducer = userProducer;
    }

    @PostMapping
    public ResponseEntity<Void> createUser(@RequestBody final UserRequest userRequest) {

        try {
            userProducer.send(userRequest);
            return ResponseEntity.ok().build();
        } catch (JsonProcessingException e) {
            return ResponseEntity.internalServerError().build();
        }

    }

}
