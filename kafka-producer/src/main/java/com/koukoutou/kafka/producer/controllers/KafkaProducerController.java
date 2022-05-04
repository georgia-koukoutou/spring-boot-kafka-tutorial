package com.koukoutou.kafka.producer.controllers;

import com.koukoutou.kafka.producer.services.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaProducerController {

    @Autowired
    private KafkaProducer producer;

    @PostMapping("/message")
    public void sendMessage(@RequestBody String message) {

        producer.sendMessage("test", message);
    }


}
