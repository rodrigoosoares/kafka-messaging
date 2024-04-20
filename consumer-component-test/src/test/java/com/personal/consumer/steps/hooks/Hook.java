package com.personal.consumer.steps.hooks;

import io.cucumber.java.BeforeAll;
import org.testcontainers.containers.DockerComposeContainer;
import org.testcontainers.containers.wait.strategy.Wait;

import java.io.File;

public class Hook {

    private static DockerComposeContainer containers = new DockerComposeContainer(new File("docker-compose.yaml"))
            .withExposedService("zookeeper", 2181, Wait.forListeningPort())
            .withExposedService("kafka", 9092, Wait.forListeningPort())
            .withExposedService("consumer", 8080, Wait.forListeningPort())
            .withLocalCompose(true);

    @BeforeAll
    public static void beforeAll() {

        containers.start();
    }

}
