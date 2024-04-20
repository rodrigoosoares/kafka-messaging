package com.personal.consumer.steps;

import com.personal.consumer.utils.KafkaProducerUtils;
import io.cucumber.java8.En;

public class StepDefinition implements En {

    public StepDefinition() {

        Given("I have the number {int}", (Integer number) -> {
            KafkaProducerUtils.produceMessage("Test message");
        });
    }

}
