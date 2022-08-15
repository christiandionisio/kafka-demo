package com.example.kafkademo.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "${kafka.topic.name}")
    public void listener(@Payload String message) {
        log.info("Message received {} ", message);

        //Do something
    }


}
