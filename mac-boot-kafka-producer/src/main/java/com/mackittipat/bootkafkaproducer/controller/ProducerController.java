package com.mackittipat.bootkafkaproducer.controller;

import com.mackittipat.bootkafkaproducer.bean.Message;
import com.mackittipat.bootkafkaproducer.service.ProducerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producers")
public class ProducerController {

    private final static Logger log = LoggerFactory.getLogger(ProducerController.class);

    @Autowired
    private ProducerService producerService;

    @GetMapping("/")
    public String hello() {
        return "Hello";
    }

    @PostMapping("/messages")
    public void post(@RequestBody Message message) {
        log.info("Receiving message = {}", message.toString());
        producerService.send(message);
    }
}
