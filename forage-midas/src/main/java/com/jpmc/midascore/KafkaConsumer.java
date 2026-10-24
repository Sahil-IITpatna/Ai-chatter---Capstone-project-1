package com.jpmc.midascore;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "${general.kafka-topic}", groupId = "midas-core-group")
    public void listen(Object transaction) {
        // Task 2 ke liye debugger ka breakpoint isi line par lagana hai
        System.out.println("Received incoming transaction: " + transaction);
    }
}
