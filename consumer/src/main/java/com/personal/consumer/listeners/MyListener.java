package com.personal.consumer.listeners;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener {

    @KafkaListener(topics = "topic-test", groupId = "messaging-consumer-group-id")
    public void listen(final ConsumerRecord<String, String> userMessage) {

        System.out.println(userMessage.value());

    }
}
