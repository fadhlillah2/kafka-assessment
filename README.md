# Java Spring Boot + Apache Kafka Example

This is a simple Java Spring Boot application that interacts with Apache Kafka to send and receive messages.

## Description

This application generates user profiles (name, address, phone, age), sends them to a Kafka topic, then consumes them and filters out the ones with odd ages. The consumed user profiles with odd ages are printed in the console.

## Code Structure

- **User.java:** This is a simple POJO (Plain Old Java Object) that represents a user profile.

- **KafkaProducer.java:** This class is responsible for sending User objects to a Kafka topic called "UserProfiles".

- **KafkaConsumer.java:** This class consumes User objects from the "UserProfiles" Kafka topic. If the age of the user is odd, it prints the user's profile to the console.

- **UserGenerator.java:** This class generates 1000 random User objects and sends them to the Kafka topic using the KafkaProducer.

- **Application.java:** This is the main Spring Boot application class. It runs the UserGenerator upon startup.

## Setup & Run

### Prerequisites

- Java 8 or higher
- Apache Kafka
- Maven

### Steps to Run

1. Make sure your Kafka server is running. If not, start it.

2. Create a Kafka topic named `UserProfiles`.

3. Clone this repository: `git clone https://github.com/username/repository.git`.

4. Navigate to the root directory of the project.

5. Build the project using Maven by running: `mvn clean install`.

6. Run the application: `java -jar target/{your-jar-file-name}.jar`.

The application will start generating user profiles, send them to the Kafka topic, consume them, and print out the profiles with odd ages to the console.

## Configuration

In the `application.properties` file:

```properties
spring.kafka.producer.bootstrap-servers=localhost:9092
spring.kafka.producer.key-serializer=org.apache.kafka.common.serialization.StringSerializer
spring.kafka.producer.value-serializer=org.springframework.kafka.support.serializer.JsonSerializer

spring.kafka.consumer.bootstrap-servers=localhost:9092
spring.kafka.consumer.group-id=group_id
spring.kafka.consumer.auto-offset-reset=earliest
spring.kafka.consumer.key-deserializer=org.apache.kafka.common.serialization.StringDeserializer
spring.kafka.consumer.value-deserializer=org.springframework.kafka.support.serializer.JsonDeserializer
spring.kafka.consumer.properties.spring.json.trusted.packages=*
```

Replace `localhost:9092` with your Kafka server address and port if it's not running on localhost. The producer and consumer are both configured to use the same Kafka server.

**Note:** The project excludes DataSource configuration as it does not require a database connection.

## License

This project is licensed under the terms of the MIT license.
