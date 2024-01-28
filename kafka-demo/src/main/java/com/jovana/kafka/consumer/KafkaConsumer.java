package com.jovana.kafka.consumer;

import com.jovana.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class KafkaConsumer {

    //@KafkaListener(topics = "jovana", groupId = "myGroup")
    public void consumeMsg(String msg){
      log.info(format("Consuming the message from jovana Topic:: %s", msg));

    }
    @KafkaListener(topics = "jovana", groupId = "myGroup")
    public void consumeJsonMsg(Student student){
        log.info(format("Consuming the message from jovana Topic:: %s", student.toString()));

    }
}
