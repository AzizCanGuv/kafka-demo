package com.kafka.example.listener;

import com.kafka.example.MessageRequest;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "emailTopic", groupId = "groupId1")
    void listener(MessageRequest data){
        System.out.println("Listener recieved: " + data + " !!!");
    }
}
