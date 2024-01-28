package com.jovana.kafka.controller;

import com.jovana.kafka.payload.Student;
import com.jovana.kafka.producer.KafkaJsonProducer;
import com.jovana.kafka.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/messages")
public class MessageController {
    private final KafkaProducer kafkaProducer;
    private final KafkaJsonProducer kafkaJsonProducer;

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody String message){
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message queued successfully");
    }
    @PostMapping("/json")
    public ResponseEntity<String> sendMessage(@RequestBody Student student){
        kafkaJsonProducer.sendMessage(student);
        return ResponseEntity.ok("Message queued successfully as JSON");
    }
}
