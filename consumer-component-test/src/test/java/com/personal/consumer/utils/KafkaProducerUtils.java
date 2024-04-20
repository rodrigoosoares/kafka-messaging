package com.personal.consumer.utils;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class KafkaProducerUtils {

    public static void produceMessage(final String payload) {

        Properties properties = new Properties();
        properties.put("bootstrap.servers", "localhost:29092");
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        try (KafkaProducer<String, String> producer = new KafkaProducer<>(properties)) {
            String topic = "topic-test";

            producer.send(new ProducerRecord<>(topic, payload)).get();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

}
