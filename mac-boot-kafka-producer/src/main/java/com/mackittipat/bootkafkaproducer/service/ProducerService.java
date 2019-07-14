package com.mackittipat.bootkafkaproducer.service;

import com.mackittipat.bootkafkaproducer.bean.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
    private KafkaTemplate<String, Message> kafkaTemplate;

    public void send(Message message) {
        kafkaTemplate.send("mac-topic", message);
    }
}
