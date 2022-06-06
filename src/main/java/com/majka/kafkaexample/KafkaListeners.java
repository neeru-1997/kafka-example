package com.majka.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "majka",
            groupId = "groupId"
    )
    void listener(String data){
        System.out.println("Listener Received: " + data + " **");
    }
}
