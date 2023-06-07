package com.komodo.kafkaassessment.service;

import com.komodo.kafkaassessment.entity.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    
    @KafkaListener(topics = "UserProfiles", groupId = "group_id")
    public void consume(User user) {
        if (user.getAge() % 2 != 0) {
            System.out.println("User with odd age: " + user);
        }
    }
}
