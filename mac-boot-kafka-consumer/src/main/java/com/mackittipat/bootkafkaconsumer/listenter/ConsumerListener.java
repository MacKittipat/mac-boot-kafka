package com.mackittipat.bootkafkaconsumer.listenter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerListener {

    private final Logger log = LoggerFactory.getLogger(ConsumerListener.class);

    @KafkaListener(topics = "mac-topic", groupId = "mac-groupId")
    public void consume(String message) {
        log.info("Receiving message from Kafka. {}", message);
    }

}
