package com.kafka.example.controller;

import com.kafka.example.MessageRequest;
import com.kafka.example.Utils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.SocketException;

@RestController
@RequestMapping("api/v1/messages")
public class MessageController {
    @Value("${kafka.test.topic}")
    private String kafkaTopicName;
    private KafkaTemplate<String, String> kafkaTemplate;

    public MessageController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    @PostMapping("/send")
    public void publish(@RequestBody MessageRequest request) throws SocketException {
        String uniqueKey = Utils.generateUniqueKey();
        kafkaTemplate.send(kafkaTopicName, uniqueKey, request.message());
    }


}
