package com.komodo.kafkaassessment.helper;

import com.komodo.kafkaassessment.entity.User;
import com.komodo.kafkaassessment.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class UserGenerator implements CommandLineRunner {

    @Autowired
    private KafkaProducer producer;

    private Random random = new Random();

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 1000; i++) {
            User user = new User();
            user.setName("User" + i);
            user.setAddress("Address" + i);
            user.setPhone("Phone" + i);
            user.setAge(random.nextInt(100));
            producer.produce(user);
        }
    }
}
