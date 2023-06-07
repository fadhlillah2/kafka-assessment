package com.komodo.kafkaassessment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class KafkaAssessmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaAssessmentApplication.class, args);
    }

}
