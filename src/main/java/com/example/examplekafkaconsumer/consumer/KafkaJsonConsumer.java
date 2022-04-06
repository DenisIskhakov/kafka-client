package com.example.examplekafkaconsumer.consumer;



import com.example.examplekafkaconsumer.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;
import org.springframework.kafka.listener.ContainerProperties;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Component
public class KafkaJsonConsumer {

    Logger logger = LoggerFactory.getLogger(KafkaJsonConsumer.class);

    @KafkaListener(topics = "TOPIC-DEMO-JSON", groupId = "group_id")
    public void consume(User message, Acknowledgment ack) {
        logger.info("Consuming Message {}", message);
        ack.acknowledge(); // <-- ack
    }



}