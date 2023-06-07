package com.komodo.kafkaassessment.service;

import com.komodo.kafkaassessment.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    public void produce(User user) {
        kafkaTemplate.send("UserProfiles", user);
    }
}
