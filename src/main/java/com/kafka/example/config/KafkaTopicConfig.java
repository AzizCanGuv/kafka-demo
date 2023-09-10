package com.kafka.example.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Value("${kafka.test.topic}")
    private String kafkaTopicName;

    @Bean
    public NewTopic senderTopic(){
        return TopicBuilder.name(kafkaTopicName).build();
    }


}
