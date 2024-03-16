package com.personal.producer.producers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.personal.producer.models.UserRequest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public UserProducer(KafkaTemplate<String, String> kafkaTemplate) {

        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(final UserRequest userRequest) throws JsonProcessingException {
        
        kafkaTemplate.send("topic-test", "Hello Kafka!");

    }

}
