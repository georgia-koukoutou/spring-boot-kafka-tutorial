package com.example.kafka.consumer.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "test", groupId = "myGroup")
    public void processMessage(String content){
        System.out.println("Message received: " + content);
    }
}
