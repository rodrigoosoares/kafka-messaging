# Summary

A simples Spring application using Spring Kafka to produces and consuming messages using Kafka Broker

# Usage

## 1. Start Docker Compose file

```bash
docker-compose up
```

## 2. Start Producer and Consumer applications

### Producer

```bash
cd producer && mvn spring-boot:run
```

### Consumer

```bash
cd producer && mvn spring-boot:run
```

## 3. Produces message to consume

The consumer application is listening for the topic 'topic-test'

### Produces message with Producer

```bash
curl --location 'http://localhost:8090' \
--header 'Content-Type: application/json' \
--data '{
"id": 7012,
"name": "Pikachu"
}'
```

### Produces message with command line

```bash
docker exec -it kafka kafka-console-producer --broker-list localhost:9092 --topic topic-test
```